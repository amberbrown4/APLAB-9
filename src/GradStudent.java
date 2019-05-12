import java.util.ArrayList;

public class GradStudent {
    private ArrayList<Publication> publications;
    private Professor advisor;

    public ArrayList<Publication> getPublications(){
        return publications;
    }
    public void addPublication(Publication publication){
        publications.add(publication);
    }

}
