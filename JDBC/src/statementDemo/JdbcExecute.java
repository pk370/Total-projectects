package statementDemo;

import java.sql.*;
import java.util.Scanner;

//If we do not know what is the type of query then we can use execute method.
public class JdbcExecute {
    public static void main(String[] args) throws SQLException {
        //        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movies", "root", "123456");
        Statement st = con.createStatement();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean b = st.execute(s);
        if(b==true){
            ResultSet rs=st.executeQuery(s);
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
        }
        else{
            int val=st.executeUpdate(s);
            System.out.println(val);
        }
        con.close();
    }
}
