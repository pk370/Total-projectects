package Metadata;

import java.sql.*;

//***most of the drivers do not support parameter metadata..
public class ParameterDemo {
    public static void main(String[] args) throws SQLException {
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","123456");
        PreparedStatement statement=con.prepareStatement("insert into telugumovies values(?,?,?)");
        ParameterMetaData pmd=statement.getParameterMetaData();
        System.out.println(pmd.getParameterCount());
        System.out.println(pmd.getParameterType(2));
        System.out.println(pmd.getParameterMode(2));


    }
}
