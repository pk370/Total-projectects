package rowsetinfo;

import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class WebRowSetDemo2 {
    public static void main(String[] args) throws SQLException, FileNotFoundException {
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","123456");
        RowSetFactory rowSetFactory= RowSetProvider.newFactory();
        WebRowSet webRowSet=rowSetFactory.createWebRowSet();
        con.setAutoCommit(false);
        FileReader fileReader=new FileReader("webtest.xml");
        webRowSet.readXml(fileReader);
        webRowSet.setCommand("select * from telugumovies");
        webRowSet.execute(con);//we can have different database connections as the parameter
        webRowSet.moveToCurrentRow();
        webRowSet.acceptChanges();
        while(webRowSet.next()){
            System.out.println(webRowSet.getInt(1)+" "+webRowSet.getString(2)+" "+webRowSet.getString(3));
        }
    }
}
