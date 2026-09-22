import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Launch_app2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //load and register the driver
        // convert the jdbc call into db specific
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Establish the connection
        String url="jdbc:mysql://localhost:3306/jdbclearning";
        String user="root";
        String password="viveMYsql#79";
        Connection connect = DriverManager.getConnection(url,user,password);


        // creating the statement
        ///it will carry the query to database
        Statement statement= connect.createStatement();





        // UPDATION (CURD)// YAHA SE HI CHANGE HAIN BAKI SAAB SAME HAIN

        String sql="UPDATE studentInfo set sage=22 where id=1";
        statement.executeUpdate(sql);
        int rowAffected= statement.executeUpdate(sql);
        if(rowAffected==0)
        {
            System.out.println("Updation failed");
        }

        else
            System.out.println("Update successful");

        //close the resources


        statement.close();
        connect.close();
    }
}
