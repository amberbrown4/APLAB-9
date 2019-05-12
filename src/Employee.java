import java.util.ArrayList;

public abstract class Employee extends Person implements AccountingInterface {

    protected ArrayList<Statement> bankStatments = new ArrayList<Statement>();
    protected String position;
    protected double basicIncome;
    protected double currentIncome;

    public Employee(String firstName, String lastName, String ID, int joiningYear, Department department, String position, double basicIncome) {
        super(firstName, lastName, ID, joiningYear, department);
        this.position = position;
        this.basicIncome = basicIncome;
    }
    public abstract double calCurrentIncome();

    public abstract double isPromotable();

    public void addBankStatement(Statement statement){
        bankStatments.add(statement);
    }
    public ArrayList<Statement> statements(){
        return statements();
    }
    public void setBasicIncome(double income){
        basicIncome = income;
    }

}
