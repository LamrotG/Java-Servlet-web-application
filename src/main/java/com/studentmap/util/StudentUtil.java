package com.studentmap.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentUtil {

    // Update these with your database details
    private static final String URL = "jdbc:mysql://localhost:3306/your_database_name"; // e.g., "jdbc:mysql://localhost:3306/studentdb"
    private static final String USER = "root"; // your DB username
    private static final String PASSWORD = "password"; // your DB password

    // Static method to get a database connection
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
