package batchupdates;

import java.sql.*;
import java.util.Scanner;
//If we want to execute multiple queries It is better to use batches. Because if we use batches we only send the request to the datebase
//only once and get all the responses at a time.
//If we do not use batches we should send the multiple queries multiple times to the database so there might be a network traffic problem.
//so it is recommended to use bathces.
//we can only send non-select queries to the database through bathces.
public class BatchUpdatesStatement {
    public static void main(String[] args) throws SQLException {
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","123456");
        Statement st=con.createStatement();
        st.addBatch("insert into telugumovies values(8,'jawan','sharuk')");
        st.addBatch("update telugumovies set mname='pathan' where hero='sharuk'");
        int[] arr=st.executeBatch();
        for (int k:arr) {
            System.out.print(k+" ");
        }
    }
}
