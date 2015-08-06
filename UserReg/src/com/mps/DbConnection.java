package com.mps;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class DbConnection {
    private static String USER_NAME_DB="root";
    private static String USER_PASSWORD_DB="root";
    private static String DB_NAME="userregistration";
    private static String HOST_NAME="localhost";
    
 
    
     public Connection getDBConnection() throws Exception 
      {
    	 Class.forName("com.mysql.jdbc.Driver"); 
    	 Connection conn = null;
          String URL="jdbc:mysql://"+HOST_NAME+":3306/"+DB_NAME;
          try{
              conn = (Connection) DriverManager.getConnection(URL,USER_NAME_DB, USER_PASSWORD_DB);
          }
          catch(Exception e)
          {
              e.printStackTrace();
          }
          
          return conn;
      }
}
