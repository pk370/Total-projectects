package callableStatement;

import java.sql.*;
import java.util.Scanner;
//*********************************these classes are used to call stored procedures**************************************
public class callableStatementInsert {
    public static void main(String[] args) throws SQLException {
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","123456");
        CallableStatement cs=con.prepareCall("call insertMovie(?,?,?)");
        cs.setInt(1,new Scanner(System.in).nextInt());
        cs.setString(2,new Scanner(System.in).next());
        cs.setString(3,new Scanner(System.in).next());
        int ans=cs.executeUpdate();
        System.out.println(ans);
    }
}
class CallableStatementDelete{
    public static void main(String[] args) throws SQLException {
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","123456");
        CallableStatement cs=con.prepareCall("call deleteMovie(?)");
        cs.setInt(1,7);
        int ans=cs.executeUpdate();
        System.out.println(ans);
    }
}
class CallableStatementGetMovies{
    public static void main(String[] args) throws SQLException {
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","123456");
        CallableStatement cs=con.prepareCall("call getMovies()");
        ResultSet rs=cs.executeQuery();
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }
    }
}
class CallableStatementGetNumberOfMovies{
    public static void main(String[] args) throws SQLException {
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","123456");
        CallableStatement cs=con.prepareCall("getNumberOfMovies()");
        int ans=cs.executeUpdate();
        System.out.println(ans);
    }
}
class CallableStatementGetMovieName{
    public static void main(String[] args) throws SQLException {
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","123456");
        CallableStatement cs=con.prepareCall("call getMovieName(?,?)");
        cs.setInt(1,3);
        cs.registerOutParameter(2,Types.VARCHAR);
        cs.execute();
        System.out.println(cs.getString(2));
    }
}
class CallableStatementUpadateValue{
    public static void main(String[] args) throws SQLException {
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","123456");
        CallableStatement cs=con.prepareCall("call updatevalue(?,?)");
        cs.registerOutParameter(1,Types.INTEGER);
        cs.setInt(1,10);
        cs.setInt(2,7);
        cs.execute();
        System.out.println(cs.getString(cs.getInt(1)));
    }
}
//**************************this  below classes are used to call stored functions**************************
class storedFunctionDemo{
    public static void main(String[] args) throws SQLException {
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","123456");
        CallableStatement cs=con.prepareCall("{?=call add(?,?)}");
        cs.registerOutParameter(1,Types.INTEGER);
        cs.setInt(2,10);
        cs.setInt(3,7);
        cs.execute();
        System.out.println(cs.getInt(1));
    }
}