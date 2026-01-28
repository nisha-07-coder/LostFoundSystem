package test;

import java.sql.Connection;

public class TestDBConnection {
    public static void main(String[] args) {

        // Get connection from DBConnection class
        Connection con = DBConnection.getConnection();

        // Check connection
        if (con != null) {
            System.out.println(" Database Connected Successfully");
        } else {
            System.out.println(" Database Connection Failed");
        }
    }
}
