package transactionmanagement;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//Process of combining all the related operations and executing them on the rule either all or none, is called transaction management.
/*
types of transaction..
1.local transaction
2.global transaction
1.local transaction: all the operations in transaction are executed over the same database.
2.global transaction:all the operations in transaction are executed over the different database.

implementing the transaction..
1.disable the autoCommit mode of jdbc
   by default the autoCommit method is enabled.so the every change we have done in application will be reflected on the database.
   so we should disable it like below
   con.autoCommit(false)
2.con.commit..
   If all the operations are executed then we should use commit method.
3.con.rollback..
   If any one of the operations not exected then we should use  rollback method so the changes are not reflected into the database.

 */
public class TransactionDemo1 {
    public static void main(String[] args) throws SQLException {
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","123456");
        Statement st=con.createStatement();
        con.setAutoCommit(false);
        try{
            st.execute("insert into telugumovies values(15,'kick', 'raviteja')");
            st.execute("insert into telugumovies values(16,'kick2','raviteja')");
            con.commit();
            System.out.println("the records are entered");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            con.rollback();
            System.out.println("the records are not entered");
        }
    }
}
