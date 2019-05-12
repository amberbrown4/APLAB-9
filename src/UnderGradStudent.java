public class UnderGradStudent extends Student{

    private Type field;

    public UnderGradStudent(String firstName, String lastName, String ID, int joiningYear, Department department, Type field) {
        super(firstName, lastName, ID, joiningYear, department);
        this.field = field;
    }

    public void setField(Type field) {
        this.field = field;
    }

    public Type getField()
    {
        return field;
    }
}

}
