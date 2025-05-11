package rowsetinfo;


import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

/*
   It is same as resultSet but the only difference is it is by default scrollable and updatable.
 */
public class JdbcRowSetDemo {
    public static void main(String[] args) throws Exception {
        RowSetFactory rowSetFactory= RowSetProvider.newFactory();
        javax.sql.rowset.JdbcRowSet jdbcRowSet=rowSetFactory.createJdbcRowSet();
        jdbcRowSet.setUrl("jdbc:mysql://localhost:3306/movies");
        jdbcRowSet.setUsername("root");
        jdbcRowSet.setPassword("123456");
         jdbcRowSet.setCommand("select * from courses");
         jdbcRowSet.execute();
         while(jdbcRowSet.next()){
             System.out.println(jdbcRowSet.getString(1)+" "+jdbcRowSet.getString(2)+" "+jdbcRowSet.getString(3));
         }

//        {//for inserting data
//            jdbcRowSet.moveToInsertRow();
//            jdbcRowSet.updateInt(1,777);
//            jdbcRowSet.updateString(2,"f2");
//            jdbcRowSet.updateString(3,"venky");
//            jdbcRowSet.insertRow();
//        }
//        {//for updating row.
//            jdbcRowSet.updateInt(1,777);
//            jdbcRowSet.updateString(2,"f2");
//            jdbcRowSet.updateString(3,"varun");
//            jdbcRowSet.updateRow();
//        }
//        {//for deleting row
//            jdbcRowSet.deleteRow();
//        }
    }
}
