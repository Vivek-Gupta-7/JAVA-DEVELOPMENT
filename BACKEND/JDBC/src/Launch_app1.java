import java.sql.*;


public class Launch_app1
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        /*STEP 1
        IMPORTING PACKAGES AND ADD JAR FILES
        CREATE THE DATABASE

        step 2
        //load and register in driver



         */

        //load and register the driver
        // convert the jdbc call into db specific



            Class.forName("com.mysql.cj.jdbc.Driver");

            //Establish the connection
            String url = "jdbc:mysql://localhost:3306/jdbclearning";
            String user = "root";
            String password = "viveMYsql#79";
            Connection connect = DriverManager.getConnection(url, user, password);


            // creating the statement
            ///it will carry the query to database
            Statement statement = connect.createStatement();

            //  insert the data in database(CURD)

            String sql = "INSERT INTO studentInfo(id,sname,sage,scity) VALUES(2, 'Priyanka', 12, 'Bengaluru')";
            int rowAffected = statement.executeUpdate(sql);//.executeupdate isliya kyuki jaaab bhi insert dlt ye update karnege toh ye use karta hain

            if (rowAffected == 0) {
                System.out.println("'unable to insert the data");
            } else
                System.out.println("Data Inserted successfully");

            //process the result

            //close the resources


            statement.close();
            connect.close();






    }
}
