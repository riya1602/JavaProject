import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;

/**
 * Created by expert on 30/7/18.
 */
public class Db1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");//registering driver class
        //forname is the method in class
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root", "root");
        CallableStatement cs = connection.prepareCall("{call getDetails(?,?,?)}");
       // CallableStatement cs = connection.prepareCall("{call getDetails}");
        cs.setInt(1, 1100);
        cs.setString(2, "anu");
        cs.registerOutParameter(3,Types.INTEGER);
        cs.execute();
       // int x=cs.getInt(3);
        int y=cs.getInt("total");
        System.out.println(y);

        //ResultSet rs1 = cs.getResultSet();
        /*while (rs1.next()) {
            System.out.println(rs1.getInt(1) + " " + rs1.getString(2));
        }*/
    }
}

