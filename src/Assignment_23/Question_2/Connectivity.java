package Assignment_23.Question_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectivity {
    static Connection con;
    public static Connection Create(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/eltp_jan_23";
            String uname = "root";
            String pass = "12345678";

            con = DriverManager.getConnection(url,uname,pass);


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return con;
    }
}

