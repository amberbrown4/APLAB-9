public class Statement {

    private double amount;
    private AccountingInterface receiver;

    public Statement(double amount, AccountingInterface receiver) {
        this.amount = amount;
        this.receiver = receiver;
    }
    public double getAmount(){
        return amount;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }
    public AccountingInterface getReceiver(){
        return receiver;
    }
    public void setReceiver(Employee receiver){
        this.receiver = receiver;
    }

}
