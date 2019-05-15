import java.util.ArrayList;

public class AccountingManagement {
    private ArrayList<Account> acounts = new ArrayList<Account>();
    private ArrayList<Statement> statements = new ArrayList<Statement>();
    public void addAccount(AccountingInterface user){
        acounts.add(new Account(user));
    }
    public void addStatement(Statement statement){
        statements.add(statement);
    }
    public void Settle(){
        for (Account acount : acounts) {
            addStatement(acount.CheckOut());
        }
    }
    public ArrayList<Statement> getStatements(){
        return statements;
    }

}
