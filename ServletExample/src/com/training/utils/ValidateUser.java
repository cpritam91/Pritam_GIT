package com.training.utils;

import java.sql.*;

import com.training.entity.User;

public class ValidateUser {

	private Connection con;
	
	public ValidateUser() {
		con = SQLConnection.getOracleConnection();
	}
	
	public ValidateUser(Connection con) {
		this.con = con;
	}

	public boolean checkUser(User usr) {
		
		boolean found = false;
		String sql = "SELECT * FROM EmployeeLoginDetails WHERE empId = ? AND password = ? AND role = ?";
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, usr.getEmpId());
			pstmt.setString(2, usr.getPassword());
			pstmt.setString(3, usr.getRole());
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
	
	/*public User getUser(ResultSet rs)
	{
		User us = null;
		try {
			int empId = rs.getInt("empId");
			String password = rs.getString("password");
			String role = rs.getString("role");
			
			us = new User(empId,password,role);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return us;
	}*/
}
