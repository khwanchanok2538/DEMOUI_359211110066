package sample;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Controller {

    private static final String SQCONN = "jdbc:sqlite:school.sqlite";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection(SQCONN);
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }

        return null;
        
    }//getConnection
}//class