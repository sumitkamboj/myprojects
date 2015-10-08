package com.mps.dao;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
private Connection connection = null;
public Connection getConnection(){
	if(connection !=null)
		return connection;
	else
	{
		String dburl="jdbc:mysql://localhost:3306/pubstats_live";
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(dburl, "root","root");
		}catch(Exception e){
			System.out.println("something happen:"+e);
		}
		return connection;
	}
}
}
