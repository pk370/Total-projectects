package Metadata;

import java.sql.*;

public class ResultSetMetadataDemo {
    public static void main(String[] args) throws SQLException {
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","123456");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from telugumovies");
        ResultSetMetaData rsmt=rs.getMetaData();
        rs.next();
        String i=rsmt.getColumnName(1);
        System.out.println(i);
    }
}
