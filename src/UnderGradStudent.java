public class UnderGradStudent extends Student{

    private int field =0;
    public UnderGradStudent(String firstName, String lastName, String ID, int joiningYear, Department department, int field) {
        super(firstName, lastName, ID, joiningYear, department);
        this.field = field;
    }

}


