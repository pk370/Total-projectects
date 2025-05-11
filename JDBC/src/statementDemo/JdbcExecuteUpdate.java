package statementDemo;

import java.sql.*;
//executeUpdate() is used for non select queries and it returns values;
public class JdbcExecuteUpdate {
    public static void main(String[] args) throws SQLException {
        //        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","123456");
        Statement st=con.createStatement();
        int val=st.executeUpdate("insert into TeluguMovies values(6,'salar','prachash')");
        System.out.println(val);
        con.close();
    }
}
