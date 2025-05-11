package connectionpool;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//If we use drivermanager to get the connection, Everytime we use it will create new connection object everytime
// so It is not that much good. In dataSource object there are already created connection objects.
// so if we need then we can use them and after our task is completed the connection will not be destroyed.
// It will simply goes to the datasource so that we can reuse them.
//so in this way the performance is good.
public class ConnectionPoolDemo {
    public static void main(String[] args) throws SQLException {
        MysqlConnectionPoolDataSource db=new MysqlConnectionPoolDataSource();
        db.setURL("jdbc:mysql://localhost:3306/movies");
        db.setUser("root");
        db.setPassword("123456");
        Connection con=db.getConnection();
        Statement s=con.createStatement();
        ResultSet rs=s.executeQuery("select * from telugumovies");
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }

    }
}
