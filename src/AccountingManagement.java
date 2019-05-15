import java.util.ArrayList;

public class AcountingManagement {
    private ArrayList<Acount> acounts = new ArrayList<Acount>();
    private ArrayList<Statement> statements = new ArrayList<Statement>();
    public void addAccount(AccountingInterface user){
        acounts.add(new Acount(user));
    }
    public void addStatement(Statement statement){
        statements.add(statement);
    }
    public void Settle(){
        for (Acount acount : acounts) {
            addStatement(acount.CheckOut());
        }
    }
    public ArrayList<Statement> getStatements(){
        return statements;
    }

}
