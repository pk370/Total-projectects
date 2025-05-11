package resultsettypes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
//the cursor can move forward and backward also. but the database changes cannot reflected into the result set,
public class ScrollableInsensitiveResultSetDemo2 {
    public static void main(String[] args) throws SQLException, IOException {
        Properties properties=new Properties();
        properties.load(new FileInputStream("config.properties"));
        Connection con= DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("user"),properties.getProperty("password"));
        Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs=st.executeQuery("select * from TeluguMovies");//If we want to execute multiple queries with the same object
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }
        while(rs.previous()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }
        rs.absolute(5);//It will go to the mentioned row from top of the table.
        System.out.println(rs.getInt(1)+" "+rs.getString(2));
        rs.relative(2);//It will move to mentioned steps from the present cursor.
        System.out.println(rs.getInt(1)+" "+rs.getString(2));

    }
}
