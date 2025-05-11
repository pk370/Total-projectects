package blobclob;

import java.io.*;
import java.sql.*;

public class BLobDemoRetrieve {
    public static void main(String[] args) throws SQLException, IOException {
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","123456");
        PreparedStatement pr=con.prepareStatement("select * from cricketers");
        ResultSet rs=pr.executeQuery();
        FileOutputStream fi=new FileOutputStream("kohliDb.jpg");
        while(rs.next()){
            String k=rs.getString(1);
            InputStream is=rs.getBinaryStream(2);
            byte c[]=new byte[5000];
            int m=is.read(c);
            fi.write(c);
        }
    }
}
