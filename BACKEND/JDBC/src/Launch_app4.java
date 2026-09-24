import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Launch_app4 {
    public static void main(String[] args)throws ClassNotFoundException, SQLException {

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







        //Deleting the data (CURD)
        //execute query
        String sql="DELETE FROM studentInfo where id=2";
        int rowsAffected = statement.executeUpdate(sql);
        //process the result
        if(rowsAffected==0)

            System.out.println("Failed to delete the record");


        else
            System.out.println("Record deleted successful");


        //close the resources


        statement.close();
        connect.close();


    }
}
