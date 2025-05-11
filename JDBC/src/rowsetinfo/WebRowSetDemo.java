package rowsetinfo;

import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

/*
     It is same as the cachedRowSet but the main difference is it can communicate with the xml files.
 */
public class WebRowSetDemo {
    public static void main(String[] args) throws SQLException, IOException {
        RowSetFactory rowSetFactory= RowSetProvider.newFactory();
        WebRowSet webRowSet=rowSetFactory.createWebRowSet();
        webRowSet.setUrl("jdbc:mysql://localhost:3306/movies");
        webRowSet.setUsername("root");
        webRowSet.setPassword("123456");
        webRowSet.setCommand("select * from telugumovies");
        webRowSet.execute();
        FileWriter fileWriter=new FileWriter("webRs.xml");
        webRowSet.writeXml(fileWriter);
    }
}
