public interface ATMState {
    public void insertCard();
    public void ejectCard();
    public void insertPin(int insertedPin);
    public void requestCash(int cashToWithdraw);

}
