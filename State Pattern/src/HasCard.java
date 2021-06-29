public class HasCard implements ATMState{
    ATMMachine atmMachine;

    public HasCard(ATMMachine newATMMachine){
        atmMachine=newATMMachine;
    }
    @Override
    public void insertCard() {
        System.out.println("Sorry there is a Card in ATM Please Wait");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card Ejected");
        atmMachine.setAtmState(atmMachine.getNoCard());
    }

    @Override
    public void insertPin(int insertedPin) {
        if(insertedPin==1234){
            System.out.println("Correct Pin Inserted");
            atmMachine.setAtmState(atmMachine.getHasCorrectPin());
            atmMachine.correctPinEntered=true;
        }else {
            System.out.println("You Inserted Wrong Pin");
            atmMachine.correctPinEntered=false;
            System.out.println(" Card Ejected");
            atmMachine.setAtmState(atmMachine.getNoCard());
        }
    }
    HasPin hasPin;
    @Override
    public void requestCash(int cashToWithdraw) {
        if (atmMachine.correctPinEntered){
            hasPin.requestCash(cashToWithdraw);
        }else {

        }

    }
}
