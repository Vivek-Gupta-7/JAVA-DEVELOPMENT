import java.sql.*;

public class Launch_app3 {
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








        //execute query (CURD)
//
//
        String sql="SELECT * FROM studentInfo";
        //resultSet stores all the data from the bd
        ResultSet rs=statement.executeQuery(sql);

         //process the result

        while (rs.next())
        {

            //int id =rs.getInt(1);
//            System.out.println(rs.getInt(1) + " "+ rs.getString(2)+ " "+ rs.getInt(3)+ " "+rs.getString(4));
            System.out.println(rs.getInt("id") + " "+ rs.getString("sname")+ " "+ rs.getInt("sage")+ " "+rs.getString("scity"));

        }

        //close the resources
        rs.close();


        statement.close();
        connect.close();

    }
}
