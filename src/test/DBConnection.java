package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    // Change password to your MySQL password
    private static final String URL = "jdbc:mysql://localhost:3306/lost_found_db?useSSL=false&allowPublicKeyRetrieval=true";
    private static final String USER = "root";
    private static final String PASSWORD = "root07nisha!";

    // Method to get connection
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load MySQL driver
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
