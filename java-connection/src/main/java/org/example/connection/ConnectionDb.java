package org.example.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDb {

    /*public static void main(String[] args) {
        ConnectionDb db = new ConnectionDb();
        db.getConnection();
    }*/

    public Connection getConnection() {
        return connection();
    }


    private Connection connection() {
        Connection connection = null;

        try {
            //Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5438/postgres", "postgres", "postgres");
            if (connection != null) {
                System.out.println("Connected");
            }

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

        return connection;
    }

}
