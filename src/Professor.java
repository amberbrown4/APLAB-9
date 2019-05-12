import java.util.ArrayList;

public class Professor extends Employee {
    private ArrayList<Article> articles;
    private ArrayList<Course> courses;
    private String group;

    public Professor(String firstName, String lastName, String ID, int joiningYear, Department department, String position, double basicIncome, String group) {
        super(firstName, lastName, ID, joiningYear, department, position, basicIncome);
        courses = new ArrayList<Course>();
        articles = new ArrayList<Article>();
    }

    @Override
    public double isPromotable() {
        currentIncome += articles.size()*1000;
        return currentIncome;
    }

    @Override
    public double calCurrentIncome() {
        return currentIncome;

    }
}