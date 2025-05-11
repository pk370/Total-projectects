package blobclob;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//This is the program for inserting the BinaryData(photo,video,audio) to the database.
public class BlobDemoInsert {
    public static void main(String[] args) throws SQLException, FileNotFoundException {
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","123456");
        File f=new File("ckohli.jpg");
        System.out.println(f.length());

        FileInputStream fi=new FileInputStream("ckohli.jpg");

        PreparedStatement pr=con.prepareStatement("insert into cricketers values(?,?)");
        pr.setString(1,"kohli");
        pr.setBlob(2,fi);
        int k=pr.executeUpdate();
        if(k==1){
            System.out.println("1 record is inserted");
        }
        else {
            System.out.println("no record is inserted");
        }
    }
}
