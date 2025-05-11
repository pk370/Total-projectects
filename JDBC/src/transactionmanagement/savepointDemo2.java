package transactionmanagement;

import java.sql.*;
/*
save point is an interface presents in java.sql.package.
It is introduced in java 3.0.
Driver software vendor is responsible to provide the implementation for savepoint interface.
savepoint concept is only applicable in transactions only.

** within a transaction if we do not want any group of operations should not be executed base on some condition then we should use
   savepoint..
   we can use save point by using con.getSavepoint method.
 */
public class savepointDemo2 {
    public static void main(String[] args) throws SQLException {
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","123456");
        Statement st=con.createStatement();
        con.setAutoCommit(false);
            st.executeUpdate("insert into telugumovies values(17,'kick', 'raviteja')");
            st.executeUpdate("insert into telugumovies values(18,'kick2','raviteja')");
            Savepoint savepoint=con.setSavepoint();
        st.executeUpdate("insert into telugumovies values(19,'kick2','raviteja22')");
            System.out.println("something goes wrong here");
//            con.rollback();
            //con.releaseSavepoint(savepoint);
            con.commit();
            System.out.println("the records are entered");
    }
}
