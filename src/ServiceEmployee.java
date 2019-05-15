import java.util.Date;

public class ServiceEmployee extends Employee {
    private Date date = new Date();
    public ServiceEmployee(String firstName, String lastName, String ID, int joiningYear, Department department, String position, double basicIncome) {
        super(firstName, lastName, ID, joiningYear, department, position, basicIncome);
    }
    public double getCurrentIncome(){
        return currentIncome;
    }
    @Override
    public boolean isPromotable() {
            Date now = new Date();
            if(now.getYear() - date.getYear() >= 3){
                date = now;
                return true;}
            else {
                return false;}

    }

    @Override
    public Employee callEmployee() {
        return this;
    }

    @Override
    public double calCurrentIncome(){
     return currentIncome;
    }

}
