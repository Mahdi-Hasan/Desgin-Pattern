public class HasPin implements ATMState{
    ATMMachine atmMachine;
    public HasPin(ATMMachine newATMMachine){
        atmMachine=newATMMachine;
    }
    @Override
    public void insertCard() {
        System.out.println(" Sorry, There is a Card Inserted  Please Wait ");
    }

    @Override
    public void ejectCard() {
        System.out.println("Your card Ejected");
        atmMachine.setAtmState(atmMachine.getNoCard());
    }

    @Override
    public void insertPin(int insertedPin) {
        System.out.println("You Already have inserted a pin");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        if(atmMachine.cashInMachine>cashToWithdraw){
            System.out.println(cashToWithdraw+" is provided to You");
            atmMachine.cashInMachine-=cashToWithdraw;
            System.out.println("Available Balance "+atmMachine.cashInMachine+" After Successfully Withdraw Card Ejected");
            atmMachine.setAtmState(atmMachine.getNoCard());
        }else {
            System.out.println("Atm is Out Of Money Card Ejected");
            atmMachine.setAtmState(atmMachine.getNoCard());
        }
    }
}
