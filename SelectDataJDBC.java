package com.learn.august_29;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SelectDataJDBC
{
	public static void main(String...args) throws ClassNotFoundException,SQLException
	{
Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url= "jdbc:mysql://localhost:3306/Owner";
		
		String name="root";String password="root123";
		
		Connection con = DriverManager.getConnection(url,name,password);
	
		Statement stmt= con.createStatement();
		
		String query="SELECT * FROM Details";
		
		ResultSet count =stmt.executeQuery(query);
		
		if(count.next())
		{
			System.out.println(count.getInt(1)+" "+count.getString(2));
		}
	}

}
