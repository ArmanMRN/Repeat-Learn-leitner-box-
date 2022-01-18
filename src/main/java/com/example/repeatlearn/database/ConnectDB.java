package com.example.repeatlearn.database;

import java.sql.*;

public class ConnectDB{

    private final static String url = "jdbc:mysql://localhost:3306/repeat_learn";
    private final static String username = "root";
    private final static String password = "password";

    private Connection connection;

    public Connection getConnection() {
        openConnection();
        return connection;
    }

    public void openConnection(){
        try {
            connection = DriverManager.getConnection(url,username,password);
            System.out.println("connection opened successful");
        }

        catch (SQLException e) {e.printStackTrace();}
    }

    public void closeConnection(){
        try {
            connection.close();
            System.out.println("connection closed successful");
        }

        catch (SQLException e) {e.printStackTrace();}
    }
}
