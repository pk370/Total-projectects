package resultsettypes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/*
based on operations performed on result set we can divide reslutSet into two types.
1.read only resultSet(static resultset)
2.updatable resultset(dynamic resultset)
1.Read only resultSet
   It is a constant and it's number is 1007
   by default resutset type is readonly type
   We can perform only read operations by using this read only resultset.
2.updatable resultSet
   It is a constant and it's number is 1008.
   If we want to update the resultset and those changes should be reflected in the database then we should go for updatable type.
 */

//It is read only reslutSet
public class ReadDemo1 {
    public static void main(String[] args) throws IOException, SQLException {
        Properties properties=new Properties();
        properties.load(new FileInputStream("config.properties"));
        Connection con= DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("user"),properties.getProperty("password"));
        Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs=st.executeQuery("select * from TeluguMovies");//If we want to execute multiple queries with the same object
        //then we should use statement object.
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }
    }
}
