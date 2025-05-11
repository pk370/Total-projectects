package rowsetinfo;
/*
     RowSet is an interface presented in javax.sql package.
     RowSet is an alternative to the resultSet.
     If we want to handle the group of records in a more effective way then we should use rowset.
     By default, it is scrollable and updatable.
     We do not need database connection to access the rowset.
     It is serializable so that we can send this rowSet across the network
                       Types of rowSet
     1.Connected rowSet
     2.disconnected rowSet.

     1.Connected rowSet:
       To access data the database connection is mandatory.
        1.JdbcRowSetDemo..
     2.DisConnected rowSet.
       To access data the database connection is not mandatory.
         1.CachedRowSet
         2.WebRowSet
         3.JoinRowSet
         4.FilteredRowSet
 */
public class RowSetDemo1 {
    public static void main(String[] args) {

    }
}
