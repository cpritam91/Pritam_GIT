package com.training;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class SQLConnection {
	
	public static Connection getOracleConnection() {
		
		Connection con = null;
		
		try {
			
			Properties prop = new Properties();
			
			FileInputStream instream = new FileInputStream(new File("DBConnection.properties"));
			
			prop.load(instream);
			
			Class.forName(prop.getProperty("db.className"));
			
			con = DriverManager.getConnection(prop.getProperty("db.url"),
											  prop.getProperty("db.userName"),
										      prop.getProperty("db.passWord"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}

}
