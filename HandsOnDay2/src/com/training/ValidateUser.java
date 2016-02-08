package com.training;

import java.sql.*;

public class ValidateUser {

	private Connection con;
	
	public ValidateUser() {
		con = SQLConnection.getOracleConnection();
	}
	
	public ValidateUser(Connection con) {
		this.con = con;
	}

	boolean checkUser(User usr) {
		
		boolean found = false;
		String sql = "SELECT * FROM SapientUser WHERE username = ? AND password = ?";
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, usr.getUserName());
			pstmt.setString(2, usr.getPassWord());
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
			{
				found = true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return found;
	}
	
	public User getUser(ResultSet rs)
	{
		User us = null;
		try {
			String username = rs.getString("username");
			String password = rs.getString("password");
			
			us = new User(username,password);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return us;
	}
}
