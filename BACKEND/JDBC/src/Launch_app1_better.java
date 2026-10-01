import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Launch_app1_better {
    public static void main(String[] args) {


        /*STEP 1
        IMPORTING PACKAGES AND ADD JAR FILES
        CREATE THE DATABASE

        step 2
        //load and register in driver



         */

                //load and register the driver
                // convert the jdbc call into db specific

        Connection connect =null;
        Statement statement=null;
                try {
                    connect = JDBCUtility.getConnection();


                    // creating the statement
                    ///it will carry the query to database
                     statement = connect.createStatement();




                     //  insert the data in database(CURD)

                    String sql = "INSERT INTO studentInfo(id,sname,sage,scity) VALUES(3, 'Vriya', 7, 'Bengaluru')";
                    int rowAffected = statement.executeUpdate(sql);//.executeupdate isliya kyuki jaaab bhi insert dlt ye update karnege toh ye use karta hain

                    if (rowAffected == 0) {
                        System.out.println("'unable to insert the data");
                    } else
                        System.out.println("Data Inserted successfully");

                    //process the result


                }
                catch (SQLException e)
                {
                    e.printStackTrace();
                }
                catch (Exception e)
                {
                    e.printStackTrace();

                }

                finally
                {
                    //close the resources
                    try
                    {
                        JDBCUtility.closeConnection(connect,statement);
                    }
                    catch (SQLException e)
                    {
                        e.printStackTrace();
                    }
                }




            }
        }







