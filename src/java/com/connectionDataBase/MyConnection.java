// package com.connectionDataBase;

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.SQLException;


// public class MyConnection {
//      public static Connection getConnection(){
//        Connection con = null;
//    try{
//        Class.forName("com.mysql.cj.jdbc.Driver");
// con = DriverManager.getConnection("jdbc:mysql://awseb-e-8xpp3g6dru-stack-awsebrdsdatabase-nlisv5a3vagz.carmwgq06jgs.us-east-1.rds.amazonaws.com:3306/mydb?useSSL=true","admin","system88");   
//    }
//    catch(ClassNotFoundException ce){
//        ce.printStackTrace();
//        System.out.println("Error on connection Please check DriverName OR Library");
//    }catch(SQLException sqle){
//        sqle.printStackTrace();
//        System.out.println("Error on creating connection Please check URL USN PWD");
       
//    }
//    return con;
//    }
  
// }





package com.connectionDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    public static Connection getConnection() {
        Connection con = null;
        try {
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