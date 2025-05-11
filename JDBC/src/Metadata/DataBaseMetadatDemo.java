package Metadata;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
meta data means data about data.
database metadata means data about metadata.
 */
public class DataBaseMetadatDemo {
    public static void main(String[] args) throws SQLException {
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","123456");
        DatabaseMetaData databaseMetaData=con.getMetaData();
        String s1=databaseMetaData.getDriverName();
        String s2=databaseMetaData.getDriverVersion();
        System.out.println(s1+" "+s2);
    }
}
