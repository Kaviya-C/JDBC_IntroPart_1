package com.learn.august_29;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class InsertDataJDBC 
{
	public static void main(String...args) throws ClassNotFoundException ,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url= "jdbc:mysql://localhost:3306/Owner";
		
		String name="root";String password="root123";
		
		Connection con = DriverManager.getConnection(url,name,password);
	
		Statement stmt= con.createStatement();
		
		String query="INSERT INTO Details (revenue,name) Values(400000,\"Kaviya\")";
		
		int count =stmt.executeUpdate(query);
		
		System.out.println(count+" rows affected");
	
	
	
	
	}

}
