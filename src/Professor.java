import java.util.ArrayList;
import java.util.Date;

public class Professor extends Employee {
    private ArrayList<Article> articles;
    private ArrayList<Course> courses;
    private String group;
    private int finalNumOfArticlesEachTime = 0;

    public Professor(String firstName, String lastName, String ID, int joiningYear, Department department, String position, double basicIncome, String group) {
        super(firstName, lastName, ID, joiningYear, department, position, basicIncome);
        courses = new ArrayList<Course>();
        articles = new ArrayList<Article>();
    }

    @Override
    public boolean isPromotable() {
        if (articles.size() - finalNumOfArticlesEachTime >= 10) {
            currentIncome += articles.size() * 1000;
            finalNumOfArticlesEachTime = articles.size();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Employee callEmployee() {
        return this;
    }

    @Override
    public double calCurrentIncome() {
        return currentIncome;
    }
}