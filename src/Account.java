public class Acount {
    private AccountingInterface employee;
    private double currentIncome = 0;

    public Acount(AccountingInterface employee) {
        this.employee = employee;
    }

    public Statement CheckOut(){
        currentIncome += employee.calCurrentIncome();
        return new Statement(employee.calCurrentIncome(),employee);
    }
}
