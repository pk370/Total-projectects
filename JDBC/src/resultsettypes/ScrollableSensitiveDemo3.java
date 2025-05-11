package resultsettypes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
////the cursor can move forward and backward also. but the database changes can be  reflected into the result set,

//**** Some databases will not support scrollSensitive concurrency.
public class ScrollableSensitiveDemo3 {
    public static void main(String[] args) throws IOException, SQLException {
        Properties properties=new Properties();
        properties.load(new FileInputStream("config.properties"));
        Connection con= DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("user"),properties.getProperty("password"));
        Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs=st.executeQuery("select * from student");//If we want to execute multiple queries with the same object
        System.in.read();//It is used to pause the execution and starts execution after press enter in the console.
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }
    }
}
