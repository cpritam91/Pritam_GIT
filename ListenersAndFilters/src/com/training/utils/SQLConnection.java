package com.training.utils;


import java.sql.*;

public class SQLConnection {

	private String url;
	private String className;
	private String userName;
	private String passWord;
	
	public SQLConnection(String url,String className,String userName,String passWord) {
		this.url =url;
		this.className = className;
		this.userName = userName;
		this.passWord = passWord;
	}
	
	public Connection getOracleConnection() {
		
		Connection con = null;
		try {
			
			Class.forName(className);
			
			con = DriverManager.getConnection(url,userName,passWord);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
}
