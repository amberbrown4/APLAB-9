public class Statement {

    private double amount;
    private Employee receiver;

    public Statement(double amount, Employee receiver) {
        this.amount = amount;
        this.receiver = receiver;
    }
    public double getAmount(){
        return amount;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }
    public Employee getReceiver(){
        return receiver;
    }
    public void setReceiver(Employee receiver){
        this.receiver = receiver;
    }

}
