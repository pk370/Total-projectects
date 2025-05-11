package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class PropertiesDemo {

    public static void main(String[] args) throws SQLException, IOException {
        Properties properties=new Properties();
        properties.load(new FileInputStream("config.properties"));
        String url=properties.getProperty("url");
        String user=properties.getProperty("user");
        String password=properties.getProperty("password");
        Connection con = DriverManager.getConnection(url,user,password);
        Statement st = con.createStatement();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean b = st.execute(s);
        if(b==true){
            ResultSet rs=st.executeQuery(s);
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
        }
        else{
            int val=st.executeUpdate(s);
            System.out.println(val);
        }
        con.close();
    }
}
