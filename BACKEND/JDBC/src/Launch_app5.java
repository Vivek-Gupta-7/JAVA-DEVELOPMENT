import java.sql.*;

public class Launch_app5 {
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





        // wherever we use non-SELECT query we have to use method executUpdate(insert,update and delete) and for  SELECT query we have method executequery . so by using execute only we can do all this four together
        String sql ="SELECT *FROM studentInfo";
        //execute query
        boolean status = statement.execute(sql);
        //process the result

        // if true then we can use retrival
        if(status)
        {
            System.out.println("If block");
            //select
            ResultSet rs= statement.getResultSet();
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+ " "+rs.getInt(2)+ " "+rs.getInt(3)+ " "+rs.getInt(4));
            }
        }
        //else other three operation
        else
        {
            System.out.println("Else block");
            //insert,update,delete
            int rows =statement.getUpdateCount();
            if(rows==0)
                System.out.println("operation fail");
            else
                System.out.println("operation successful");
        }


        //close the resources
        statement.close();
        connect.close();
    }
}
