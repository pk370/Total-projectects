package rowsetinfo;

import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;
/*
     It is child interface of rowset.
     It is by default, scrollable and updatable.
     It is disconnected rowSet. We don't need connection to access the cachedRowSet.
     all the changes we made in the cachedrowset will be reflected in the database but the dataconneciton should be mandatory.
 */
public class CachedRowSet {
    public static void main(String[] args) throws SQLException {
        RowSetFactory rowSetFactory= RowSetProvider.newFactory();
        javax.sql.rowset.CachedRowSet cachedRowSet=rowSetFactory.createCachedRowSet();
        cachedRowSet.setUrl("jdbc:mysql://localhost:3306/movies");
        cachedRowSet.setUsername("root");
        cachedRowSet.setPassword("123456");
        cachedRowSet.setCommand("select * from telugumovies");
        cachedRowSet.execute();
        while(cachedRowSet.next()){
            System.out.println(cachedRowSet.getInt(1)+" "+cachedRowSet.getString(2)+" "+cachedRowSet.getString(3));
        }
        {//for inserting data
            cachedRowSet.moveToInsertRow();
            cachedRowSet.updateInt(1,777);
            cachedRowSet.updateString(2,"f2");
            cachedRowSet.updateString(3,"venky");
            cachedRowSet.insertRow();
        }
        {//for updating row.
            cachedRowSet.updateInt(1,777);
            cachedRowSet.updateString(2,"f2");
            cachedRowSet.updateString(3,"varun");
            cachedRowSet.updateRow();
        }
        {//for deleting row
            cachedRowSet.deleteRow();
        }
    }
}
