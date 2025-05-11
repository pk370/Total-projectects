package rowsetinfo;

import javax.sql.rowset.JoinRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
    TO have two tables information in a single rowset we use JoinRowSet..
 */
public class joinRowSet {
    public static void main(String[] args) throws SQLException {
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","123456");
        RowSetFactory rowSetFactory= RowSetProvider.newFactory();
        javax.sql.rowset.CachedRowSet cachedRowSet1=rowSetFactory.createCachedRowSet();
        cachedRowSet1.setCommand("select * from students");
        cachedRowSet1.execute(con);

        javax.sql.rowset.CachedRowSet cachedRowSet2=rowSetFactory.createCachedRowSet();
        cachedRowSet1.setCommand("select * from courses");
        cachedRowSet1.execute(con);

        JoinRowSet joinRowSet=rowSetFactory.createJoinRowSet();
        joinRowSet.addRowSet(cachedRowSet1,2);
        joinRowSet.addRowSet(cachedRowSet1,2);
        while(joinRowSet.next()){
            System.out.println(joinRowSet.getInt(1)
                    +" "+joinRowSet.getString(2)
                    +" "+joinRowSet.getString(3)
                    +" "+joinRowSet.getInt(4)
                    +" "+joinRowSet.getString(5)+
                    " "+joinRowSet.getString(6));
        }
    }
}
