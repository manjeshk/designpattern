package com.manjeshk.designpattern.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static volatile Connection connection = null;

    private DatabaseConnection() {
        if (connection != null)
            throw new RuntimeException("Use getInstance() method to create.");
    }

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            synchronized (DatabaseConnection.class) {
                if (connection == null) {
                    String dbUrl = "";
                    //Connection connection = DriverManager.getConnection(dbUrl);
                }
            }
        }

        return connection;
    }

}
