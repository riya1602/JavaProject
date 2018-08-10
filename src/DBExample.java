import java.sql.*;

/**
 * Created by expert on 26/7/18.
 */

public class DBExample {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");//registering driver class
        //forname is the method in class
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
        //establishing connection
        Statement statement=connection.createStatement();
        int i=statement.executeUpdate("insert into student values('1','renju')");


        PreparedStatement preparedStatement=connection.prepareStatement("insert into student values(?,?)");
        preparedStatement.setInt(1,3);
        preparedStatement.setString(2,"hima");
        preparedStatement.executeUpdate();



        Statement statement1=connection.createStatement();
        ResultSet rs=statement1.executeQuery("select *from student");

        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }


        connection.close();
    }

}
