public class Account {
    private AccountingInterface employee;
    private double currentIncome = 0;

    public Account(AccountingInterface employee) {
        this.employee = employee;
    }

    public Statement CheckOut(){
        currentIncome += employee.calCurrentIncome();
        return new Statement(employee.calCurrentIncome(),employee);
    }
}
