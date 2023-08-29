package com.learn.august_29;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Introduction 
{
	/*
	 * JDBC  Java Database Connectivity
	 * 4 major core components   
	 * JDBC driver
	 * Connections
	 * Statements
	 * ResultSets 
	 * 
	 * 
	 * 
	 * purpose of jdbc driver
	 * Database communication
	 * Database Independence
	 * type conversion
	 * error and exception handling
	 * 
	 * 
	 * 4 types of jdbc 
	 * JDBC_ODBC driver
	 * native api driver
	 * network protocol driver
	 * thin driver
	 * 
	 * 
	 * type -4 mostly used and we can connect the database directly
	 * 
	 * 
	 * 
	 * Connections
	 * 
	 * getConnection()   ---> DriverManager
	 * 
	 * Statements    ---> execute sql queries against the database
	 * 
	 * ResultSets    --->  query returns the data in the form of resultset
	 * 
	 * 
	 * 
	 * 
	 * MAIN STEPS TO FOLLOW:
	 * 
	 * Load and register the jdbc driver
	 * get the database connection
	 * create the statement
	 * execute the statements
	 * stored in the resultset
	 * close the connection
	 * 
	 * 
	 * 
	 * ODBC   ---> Written in c language
	 * 			   not a thread safe
	 * 			   less secured
	 * 			   platform dependent
	 *             we have to install manually
	 *             loads slow
	 *             windows specific technology
	 *             
	 *             
	 * JDBC    --->  Written in java language
	 *               loads fast
	 *               platform independent
	 *               thread safe
	 *               no need to install manually easily integrated in our java code
	 *               it runs on all os 
	 *                highly secured
	 *                
	 * 
	 * type-1
	 * jdbc odbc driver
	 * 
	 * bridge between jdbc odbc driver
	 * translate all the jdbc calls into odbc calls
	 * odbc driver converted odbc calls into database calls
	 * 
	 *    not entirely written in java language
	 *    portability issues
	 *    
	 *    
	 * type-2
	 * native api driver
	 * not entirely written in java langugae
	 * portability issues
	 * jdbc calls converted into native api database calls 
	 * drawback
	 * we have to install the vendor specifice client library
	 * 
	 * 
	 * type -3
	 * network protocol driver
	 * extra middleware component we have to maintain
	 * entirely written in java language
	 * no portable issues
	 * jdbc calls into databases specific calls
	 * 
	 * 
	 * 
	 * type-4
	 * thin driver
	 * no portable issues
	 * written in java programming language
	 * all the extra layer which we used in type 3 will be removed here
	 * jdbc calls directly converted into database calls
	 * 
	 * 
	 * Driver manager present in sql package
	 * 
	 * Statement createStatement()
	 * PreparedStatement prepareStatement()
	 * CallableStatement prepareCall()
	 * 
	 * 
	 * 
	 * executeQuery   -->   returns resultSet   -- java.sql.ResultSet
	 * retrieve some data from the database
	 * SELECT query are used here
	 * 
	 * executeUpdate    ---> return int     ---
	 * INSERT UPDATE DELETE 
	 * 
	 * 
	 * execute   CREATE ALTER DROP
	 * 
	 * 
	 * DDL    -- > Data Definition language deals with structure of the web page
	 * CREATE ALTER DROP TRUNC
	 * 
	 * 
	 * DML     --> Data Manipulation language deals with  manipulating and querying data
	 * INSERT UPDATE DELETE SELECT
	 * 
	 * 
	 * DCL      -->  related to database security  and access control
	 * GRANT REVOKE
	 * 
	 *
	 * 
	 */
	
	public static void main(String...args) throws ClassNotFoundException , SQLException
	{
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
