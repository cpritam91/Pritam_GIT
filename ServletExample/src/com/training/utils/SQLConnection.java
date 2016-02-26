package com.training.utils;

import java.sql.*;
import java.util.Properties;

public class SQLConnection {

	public static Connection getOracleConnection() {
		
		Connection con = null;
		
		try {
			
			/*Properties prop = new Properties();
			
			FileInputStream inStream = 
					new FileInputStream(new File("DbConnection.properties"));// Loading the property file
			
			prop.load(inStream);*/
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE",
					"restaurant",
					"restaurant"
					);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
}
