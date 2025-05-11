package rowsetinfo;

import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;
class rowSetListener implements RowSetListener{

    @Override
    public void rowSetChanged(RowSetEvent event) {
        System.out.println("the rowset was changed");
    }

    @Override
    public void rowChanged(RowSetEvent event) {
        System.out.println("the row was changed");
    }

    @Override
    public void cursorMoved(RowSetEvent event) {
        System.out.println("the cursor was changed");
    }
}
public class Eventhandler {
    public static void main(String[] args) throws SQLException {
        RowSetFactory rowSetFactory= RowSetProvider.newFactory();
        javax.sql.rowset.JdbcRowSet jdbcRowSet=rowSetFactory.createJdbcRowSet();
        jdbcRowSet.setUrl("jdbc:mysql://localhost:3306/movies");
        jdbcRowSet.setUsername("root");
        jdbcRowSet.setPassword("123456");
        jdbcRowSet.setCommand("select * from courses");
        jdbcRowSet.addRowSetListener(new rowSetListener());
        jdbcRowSet.execute();
        while(jdbcRowSet.next()){
            System.out.println(jdbcRowSet.getString(1)+" "+jdbcRowSet.getString(2)+" "+jdbcRowSet.getString(3));
        }
        jdbcRowSet.moveToInsertRow();
        jdbcRowSet.updateString(1,"java8");
        jdbcRowSet.updateString(2,"p8");
        jdbcRowSet.updateString(3,"k8");
        jdbcRowSet.insertRow();

    }
}
