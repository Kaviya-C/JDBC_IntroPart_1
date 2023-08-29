package com.learn.august_29;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableJDBC
{
	public static void main(String...args) throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/Owner";
		
		String username="root";
		
		String password="root123";
		
		Connection con=DriverManager.getConnection(url,username,password);
		
		Statement stmt= con.createStatement();
		
		int count=stmt.executeUpdate("Create Table Details "
				+ "(revenue INT , name VARCHAR(30))");
		
		System.out.println(count+" rows are affected");
	
		
	}

}
