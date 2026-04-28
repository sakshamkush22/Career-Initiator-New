package com.connectionDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    public static Connection getConnection() {
        Connection con = null;
        try {
          
            String dbUrl = System.getenv("DB_URL");
            String dbUser = System.getenv("DB_USER");
            String dbPass = System.getenv("DB_PASSWORD");
            
            // Debug print
            System.out.println("Runtime DB_URL = " + dbUrl);
            System.out.println("Runtime DB_USER = " + dbUser);

            Class.forName("com.mysql.cj.jdbc.Driver");

            if (dbUrl != null) {
                con = DriverManager.getConnection(dbUrl, dbUser, dbPass);
                System.out.println("Connection established successfully!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        
        return con;
    }
}