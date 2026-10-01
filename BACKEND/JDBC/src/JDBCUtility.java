import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtility

{

    static
    {
        //load and register the driver
        // convert the jdbc call into db specific
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }

        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    //The method getconnection we have created so that we dont need to write again and gain to establish the connection in all the files we can directly use this method to establish the connection
    public static Connection getConnection() throws SQLException
    {
        //Establish the connection
        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String user = "root";
        String password = "viveMYsql#79";
        return DriverManager.getConnection(url, user, password);
    }

    //The method closeconnection we have created so that we dont need to write again and again to close the resources in all the files we can directly use this method to close the resources(connection and statement)

    public static void closeConnection(Connection connect, Statement statement) throws SQLException
    {
        statement.close();
        connect.close();
    }

}
