package blobclob;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class ClobDemoInsert {
    public static void main(String[] args) throws SQLException, FileNotFoundException {
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","123456");
        FileReader fr=new FileReader("ntr.txt");
        PreparedStatement pr=con.prepareStatement("insert into heroes values(?,?)");
        pr.setString(1,"ntr");
        pr.setCharacterStream(2,fr);
        int k=pr.executeUpdate();
        if(k==1){
            System.out.println("record inserted");
        }
        else{
            System.out.println("record is not inserted");
        }
    }
}
