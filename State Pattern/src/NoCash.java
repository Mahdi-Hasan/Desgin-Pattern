public class NoCash implements ATMState{

    ATMMachine atmMachine;
    public NoCash(ATMMachine newATMMachine){
        atmMachine=newATMMachine;
    }
    @Override
    public void insertCard() {
        System.out.println("Sorry We don't have Money");
        System.out.println("Your Card Ejected");
    }

    @Override
    public void ejectCard() {
        System.out.println("Sorry We don't have Money");
        System.out.println("No Card Ejected");
    }

    @Override
    public void insertPin(int insertedPin) {
        System.out.println("Sorry We don't have Money");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("Sorry We don't have Money");
    }
}
