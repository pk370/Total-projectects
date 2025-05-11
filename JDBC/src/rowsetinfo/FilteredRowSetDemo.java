package rowsetinfo;

import javax.sql.RowSet;
import javax.sql.rowset.FilteredRowSet;
import javax.sql.rowset.Predicate;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

class StudentsFilter implements Predicate{

    @Override
    public boolean evaluate(RowSet rs) {
        boolean ans=false;
        try{
            int k=rs.getInt(1);
            if(k<2 && k>3){
                ans=true;
                System.out.println(k);
            }
        }
        catch (Exception e){
            e.getMessage();
        }
        return ans;
    }

    @Override
    public boolean evaluate(Object value, int column) throws SQLException {
        System.out.println("this is evaluate(Object value, int column)");
        return false;
    }

    @Override
    public boolean evaluate(Object value, String columnName) throws SQLException {
        System.out.println("this is evaluate(Object value, String column)");
        return false;
    }
}
public class FilteredRowSetDemo {
    public static void main(String[] args) throws SQLException {
        RowSetFactory rowSetFactory= RowSetProvider.newFactory();

        FilteredRowSet filteredRowSet=rowSetFactory.createFilteredRowSet();
        filteredRowSet.setUrl("jdbc:mysql://localhost:3306/movies");
        filteredRowSet.setUsername("root");
        filteredRowSet.setPassword("123456");
        filteredRowSet.setCommand("select * from students");

        filteredRowSet.execute();
        System.out.println("before filtering");
        while(filteredRowSet.next()){
            System.out.println(filteredRowSet.getInt(1)+" "+filteredRowSet.getString(2)+" "+filteredRowSet.getString(3));
        }
        StudentsFilter studentsFilter=new StudentsFilter();
        filteredRowSet.setFilter(studentsFilter);
        System.out.println("after filtering");
        while(filteredRowSet.previous()){
            System.out.println("dfkshfsk");
            System.out.println(filteredRowSet.getInt(1)+" "+filteredRowSet.getString(2)+" "+filteredRowSet.getString(3));
        }
    }
}
