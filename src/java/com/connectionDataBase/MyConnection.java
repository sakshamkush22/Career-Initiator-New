package com.connectionDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    public static Connection getConnection() {
        Connection con = null;
        try {
            
            // SSL config set
            System.setProperty("javax.net.ssl.trustStore", "C:\\Users\\shubh\\Downloads\\truststore.jks");
            System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
            
            // Hum Render se ye values uthayenge
            String dbUrl = System.getenv("DB_URL");
            String dbUser = System.getenv("DB_USER");
            String dbPass = System.getenv("DB_PASSWORD");

            Class.forName("com.mysql.cj.jdbc.Driver");

            if (dbUrl != null) {
                con = DriverManager.getConnection(dbUrl, dbUser, dbPass);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}