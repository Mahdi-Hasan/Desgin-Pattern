public class ATMMachine {
    ATMState atmState;

    HasCard hasCard;
    NoCard noCard;
    HasPin hasCorrectPin;
    NoCash atmOutOfMoney;

    int cashInMachine=5000;
    boolean correctPinEntered =false;
    public ATMMachine() {
        hasCard=new HasCard(this);
        noCard=new NoCard(this);
        hasCorrectPin =new HasPin(this);
        atmOutOfMoney =new NoCash(this);

        atmState=noCard;

        if(cashInMachine<0){
            atmState= atmOutOfMoney;
        }

    }

    public void setAtmState(ATMState newATMState){
        atmState=newATMState;
    }

    public void setCashInMachine(int cashInMachine) {
        this.cashInMachine = cashInMachine;
    }

    public void insertCard(){
        atmState.insertCard();
    }
    public void ejectCard(){
        atmState.ejectCard();
    }
    public void insertPin(int PinEntered){
        atmState.insertPin(PinEntered);
    }
    public void requestCash(int cashToWithdraw){
        atmState.requestCash(cashToWithdraw);
    }

    public ATMState getHasCard(){
        return hasCard;
    }

    public ATMState getNoCard(){
        return noCard;
    }
    public ATMState getHasCorrectPin(){
        return hasCorrectPin;
    }
    public ATMState getOutOfMoney(){
        return atmOutOfMoney;
    }
}
