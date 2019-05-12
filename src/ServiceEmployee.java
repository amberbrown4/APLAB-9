public class ServiceEmployee extends Employee {

    public ServiceEmployee(String firstName, String lastName, String ID, int joiningYear, Department department, String position, double basicIncome) {
        super(firstName, lastName, ID, joiningYear, department, position, basicIncome);
    }
    public double getCurrentIncome(){
        return currentIncome;
    }
    @Override
    public double isPromotable() {
        return currentIncome;
    }
    @Override
    public double calCurrentIncome(){
     return currentIncome;
    }

}
