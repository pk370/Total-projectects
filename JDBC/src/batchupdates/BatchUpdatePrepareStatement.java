package batchupdates;

import java.sql.*;
import java.util.Scanner;
//If we want to send the group of objects of the same type then it is recommended to use prepared statement.
public class BatchUpdatePrepareStatement {
    public static void main(String[] args) throws SQLException {
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","123456");
        PreparedStatement pr=con.prepareStatement("insert into telugumovies values(?,?,?)");
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("enter the number");
            int no = sc.nextInt();
            System.out.println("enter the movie name");
            String nname = sc.next();
            System.out.println("enter hero name");
            String hero = sc.next();
            pr.setInt(1, no);
            pr.setString(2, nname);
            pr.setString(3, hero);
            pr.executeUpdate();
            pr.addBatch();
            System.out.println("if you want to insert another movie (yes or no)");
            String res = sc.next();
            if (res.equals("no")) {
                break;
            }
        }
            int arr1[]=pr.executeBatch();
            for (int k:arr1) {
                System.out.print(k+" ");

        }
    }
}
