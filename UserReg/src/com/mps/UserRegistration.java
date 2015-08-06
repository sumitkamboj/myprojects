package com.mps;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.mps.DbConnection;

public class UserRegistration{
	public void newuserregistration(String firstName, String lastName, String gender, int age, String address) throws Exception
    {
        PreparedStatement psUserRegistration = null;
        String sqlUserRegistration = null;
        
        DbConnection dbcon = new DbConnection();
        Connection conn = dbcon.getDBConnection();
        sqlUserRegistration = "insert into user(First_Name,Last_Name, Gender,Age,Address) values(?,?,?,?,?)";	
        
        try{
            psUserRegistration = conn.prepareStatement(sqlUserRegistration);
            psUserRegistration.setString(1, firstName);
            psUserRegistration.setString(2, lastName);
            psUserRegistration.setString(3, gender);
            psUserRegistration.setInt(4, age);
            psUserRegistration.setString(5, address);
            psUserRegistration.executeUpdate();
        }
        catch(Exception e)
        {
           
            e.printStackTrace();
        }
        conn.close();
    }
}
