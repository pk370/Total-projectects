package statementDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

//executeQuery method is used for select queries which returns the data in result Set.
public class JdbcExecuteQuery {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
       Class.forName("com.mysql.cj.jdbc.Driver"); // It is optional.
        Properties properties=new Properties();
        properties.load(new FileInputStream("config.properties"));
        Connection con= DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("user"),properties.getProperty("password"));
        Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs=st.executeQuery("select * from TeluguMovies");//If we want to execute multiple queries with the same object
                                        //then we should use statement object.
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }
        con.close();
    }
}
