package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Login 
{
   public boolean adminlogin(String username, String password) 
   {
	   int count=0;
	   ResultSet rs;
	   Connection con=utility.DBUtility.connection();
       String query="select username,password from adminLogin";
       
	   try 
	   {
		Statement stmt=con.createStatement();
	    rs=stmt.executeQuery(query);
	    while(rs.next())
		{
			 if(username.equals(rs.getString("username")) && password.equals(rs.getString("password")) )
			 {
				 count=1;
			 }
		}
	   }
	   catch (SQLException e) 
	   {
		e.printStackTrace();
	   }
	   
	   if(count==1)
	   {
		   count=0;
		   return true;
	   }
	   else 
		   return false;   
   }
   
   
   
   public boolean changePassword(String username,String password)
   {
	int row=0;
   	Connection con=utility.DBUtility.connection();
   	String query="update adminlogin set password=? where username=?";
   	try
   	{
   	    PreparedStatement stmt= con.prepareStatement(query);
   	    stmt.setString(1,password);
   	    stmt.setString(2,username);
   	    row=stmt.executeUpdate();
   	}
   	catch(SQLException e)
   	{
   		System.out.println(e);
   	}
   	
   	if(row>0)
   	   return true;
   	else
   	   return false;
   }
   
   
   public boolean forgetPassword(int id,String username,String password)
   {
	  
	int row=0;
   	Connection con=utility.DBUtility.connection();
   	String query="update adminLogin set password=? where username=? and id=?";
   	try
   	{
   	    PreparedStatement stmt= con.prepareStatement(query);
   	    stmt.setString(1,password);
   	    stmt.setString(2,username);
   	    stmt.setInt(3,id);
   	    row=stmt.executeUpdate();
   	}
   	catch(SQLException e)
   	{
   		System.out.println(e);
   	}
   	
   	if(row>0)
   	   return true;
   	else
   	   return false;
   }
   
}
