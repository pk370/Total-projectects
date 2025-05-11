package preparestatementDemo;

import java.sql.*;

public class prepareStatementDemo1 {
    public static void main(String[] args) throws SQLException {
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","123456");
        PreparedStatement ps=con.prepareStatement("select * from TeluguMovies");//prepared statement associated with only one sql query
                                    //We cannot execute multiple sql queries using prepared statement.
                                    //If we want to execute same query multiple times then we should use prepared statement.
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }
        PreparedStatement ps1=con.prepareStatement("delete from telugumovies where mno=6");
        int i=ps1.executeUpdate();
        System.out.println(i);
       boolean b= ps1.execute();//It returns false because it is associated with non-selective query.
       boolean b1=ps.execute();//It returns true because it is associated with selective query. If we want we can run again and get the
                              //result set.
        System.out.println(b);
        System.out.println(b1);

    }

}
