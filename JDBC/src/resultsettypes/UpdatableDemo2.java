package resultsettypes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/*2.updatable resultSet
        It is a constant and it's number is 1008.
        If we want to update the resultset and those changes should be reflected in the database then we should go for updatable type.

 */
public class UpdatableDemo2 {
    public static void main(String[] args) throws IOException, SQLException {
        Properties properties=new Properties();
        properties.load(new FileInputStream("config.properties"));
        Connection con= DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("user"),properties.getProperty("password"));
        Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet rs=st.executeQuery("select * from student");//If we want to execute multiple queries with the same object
        //then we should use statement object.
        {//this block is for checking whether this drive supports type and concurrency properties or not.
        DatabaseMetaData databaseMetaData=con.getMetaData();
        System.out.println(databaseMetaData.supportsResultSetConcurrency(1003,1007));
        System.out.println(databaseMetaData.supportsResultSetConcurrency(1004,1007));
        System.out.println(databaseMetaData.supportsResultSetConcurrency(1005,1007));
        System.out.println(databaseMetaData.supportsResultSetConcurrency(1003,1008));
        System.out.println(databaseMetaData.supportsResultSetConcurrency(1004,1008));
        System.out.println(databaseMetaData.supportsResultSetConcurrency(1005,1008));
        System.out.println(databaseMetaData.supportsResultSetType(1003));
        System.out.println(databaseMetaData.supportsResultSetType(1004));
        System.out.println(databaseMetaData.supportsResultSetType(1005));
        System.out.println(databaseMetaData.supportsResultSetType(1006));
        System.out.println(databaseMetaData.supportsResultSetType(1007));
        System.out.println(databaseMetaData.supportsResultSetType(1008));
        }
        rs.last();
//        { //delete row from resultset
//            rs.last();
//            rs.deleteRow();
//        }
//        {//to enter the record
//            rs.moveToInsertRow();
//             rs.updateInt(1,2);
//             rs.updateString(2,"sathvik");
//             rs.insertRow();
//       }
//        {//to update the record
//            rs.updateString(2,"kumar");
//            rs.updateRow();
//        }"


    }
}
