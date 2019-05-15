import javax.print.DocFlavor;

public class Article {
    private String name;
    private String datepublished;

    public Article(String name, String datepublished){
        this.name = name;
        this.datepublished = datepublished;
    }

     public String getName(){
        return name;
     }
     public String getDatepublished(){
        return datepublished;
     }
}
