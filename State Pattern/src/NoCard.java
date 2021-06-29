public class NoCard implements ATMState{
    ATMMachine atmMachine;
    public NoCard(ATMMachine newATMMachine){
        atmMachine=newATMMachine;
    }
    @Override
    public void insertCard() {
        System.out.println("Card Inserted");
        atmMachine.setAtmState(atmMachine.getHasCard());
    }

    @Override
    public void ejectCard() {
        System.out.println(" Sorry, There is no Card Inserted ");
    }

    @Override
    public void insertPin(int insertedPin) {
        System.out.println(" Sorry, There is no Card Inserted ");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println(" Sorry, There is no Card Inserted ");
    }
}
