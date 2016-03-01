package com.training.utils;

import java.io.*;
//import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class SQLConnection {

	public static Connection getOracleConnection() {
		
		InputStream inStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("DbConnection.properties");
				
		Connection con = null;
		
		try {
			
			Properties prop = new Properties();
			
			
			
			System.out.println(inStream);
			/*FileInputStream inStream = 
					new FileInputStream(new File("DbConnection.properties"));// Loading the property file*/
			
			prop.load(inStream);
			
			Class.forName(prop.getProperty("db.className"));
			
			con = DriverManager.getConnection(
					prop.getProperty("db.url"),
					prop.getProperty("db.userName"),
					prop.getProperty("db.passWord")
					);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
}
