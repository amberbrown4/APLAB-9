import java.util.ArrayList;

public class Student extends Person
{
    private ArrayList<Course> courses;

    public Student(String firstName, String lastName, String ID, int joiningYear, Department department)
    {
        super(firstName, lastName, ID, joiningYear, department);
    }

    public void addCourse(Course course)
    {
        courses.add(course);
    }

    public ArrayList<Course> getCourses()
    {
        return courses;
    }
}
