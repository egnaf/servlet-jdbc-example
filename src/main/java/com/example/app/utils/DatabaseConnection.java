package com.example.app.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection connect()  throws SQLException, ClassNotFoundException {
        int port = 3306;
        String hostname = "localhost";
        String database = "university";
        String username = "root";
        String password = "root";

        String url = "jdbc:mysql://localhost:3306/university?serverTimezone=UTC";
        String driver = "com.mysql.cj.jdbc.Driver";

        Class.forName(driver);

        return DriverManager.getConnection(url, username, password);
    }
}
