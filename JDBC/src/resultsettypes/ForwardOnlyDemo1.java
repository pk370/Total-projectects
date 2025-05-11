package resultsettypes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class ForwardOnlyDemo1 {
    public static void main(String[] args) throws IOException, SQLException {
        Properties properties=new Properties();
        properties.load(new FileInputStream("config.properties"));
        Connection con= DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("user"),properties.getProperty("password"));
        Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs=st.executeQuery("select * from TeluguMovies");//If we want to execute multiple queries with the same object
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }
    }
}
