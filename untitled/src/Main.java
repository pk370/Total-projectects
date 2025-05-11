import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
interface a{
    public int[] hello();
}
public class Main implements a {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

    }

    @Override
    public int[] hello() {
        int k[]=new int[5];
        return k;
    }
}