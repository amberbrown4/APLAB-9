import java.util.ArrayList;

public class GradStudent implements AccountingInterface {
    private ArrayList<Publication> publications;
    private Professor advisor;

    public ArrayList<Publication> getPublications(){
        return publications;
    }
    public void addPublication(Publication publication){
        publications.add(publication);
    }

    @Override
    public double calCurrentIncome() {
        return 20000*publications.size();
    }

    @Override
    public AccountingInterface callEmployee() {
        return this;
    }
}
