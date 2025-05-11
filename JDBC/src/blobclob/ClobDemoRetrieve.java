package blobclob;

import java.io.*;
import java.sql.*;

public class ClobDemoRetrieve {
    public static void main(String[] args) throws SQLException, IOException {
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","123456");
        PreparedStatement pr=con.prepareStatement("select * from heroes");
        ResultSet rs=pr.executeQuery();
        while(rs.next())
        {
            String name=rs.getString(1);
            Reader rd=rs.getCharacterStream(2);
            FileWriter fileWriter=new FileWriter("ntrDb.txt");
            char c[]=new char[6000];
            rd.read(c);
            fileWriter.write(c);
        }
    }
}
