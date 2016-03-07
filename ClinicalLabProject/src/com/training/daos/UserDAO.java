package com.training.daos;

import java.sql.*;
import java.util.*;

import com.training.entities.User;
import com.training.ifaces.DAO;
import com.training.utils.SQLConnection;

public class UserDAO implements DAO<User> {

	private Connection con;
	
	public UserDAO() {
		con = SQLConnection.getOracleConnection();
	}
	
	public UserDAO(Connection con) {
		this.con = con;
	}
	
	@Override
	public int add(User t) {
		String sql = "insert into users values(?,?,?,?,?)";
		int rowAdded = 0;
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, t.getEmpId());
			pstmt.setString(2, t.getRole());
			pstmt.setString(3, t.getUserName());
			pstmt.setString(4, t.getPassWord());
			pstmt.setString(5, t.getLabCode());
			
			rowAdded = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowAdded;
	}

	@Override
	public User find(Object k) {
		User user = null;
		String key = k.toString();
		String sql = "Select * from users where username = ?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, key);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				user = getUser(rs);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	
	private User getUser(ResultSet rs) {
		
		User user = null;
		
		
		try {
			Integer empId = rs.getInt("empId");
			String role = rs.getString("Role");
			String userName = rs.getString("userName");
			String passWord = rs.getString("passWord");
			String labCode = rs.getString("labCode");
			
			user = new User(empId,userName,role,passWord,labCode);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	
	@Override
	public List<User> findAll() {
		ArrayList<User> userList = new ArrayList<User>();
		try {
			String sql = "SELECT * FROM Users";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				User us = getUser(rs);
				userList.add(us);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userList;
	}

	@Override
	public int update(User us) {
		
		int rowUpdated = 0;
		String sql = "UPDATE Users SET EmpId = ?, Role = ?, Password = ?, LabCode = ? WHERE userName = ?";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, us.getEmpId());
			pstmt.setString(2, us.getRole());
			pstmt.setString(3, us.getPassWord());
			pstmt.setString(4, us.getLabCode());
			pstmt.setString(5, us.getUserName());
			
			rowUpdated = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowUpdated;
	}

	@Override
	public int delete(Object k) {
		
		String key = k.toString();
		int rowDeleted = 0;
		String sql = "DELETE FROM Users WHERE UserName = ?";
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, key);
			rowDeleted = pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return rowDeleted;
	}
	public void closeConn() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
