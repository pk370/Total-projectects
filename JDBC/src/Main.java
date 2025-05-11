import java.sql.*;
import java.util.concurrent.Callable;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) throws SQLException {
       int a[]={4,6,4,7,8,5,9,9};
       int max1=0;
       int max2=0;
       for(int i:a){
           if(i>max1){
               max2=max1;
               max1=i;
           }
           else if(i>max2 && i!=max1){
               max2=i;
           }
       }
        System.out.println(max1 +" "+max2);
    }
}
