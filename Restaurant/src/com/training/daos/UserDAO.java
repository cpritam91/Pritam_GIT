package com.training.daos;

import java.sql.*;
import java.util.List;

import com.training.entity.*;
import com.training.ifaces.DAO;
import com.training.utils.*;

public class UserDAO implements DAO<User> {

	private Connection con;
	
	public UserDAO(Connection con) {
		super();
		this.con = con;
	}

	public UserDAO() {
		super();
		con = SQLConnection.getOracleConnection();
	}
	
	@Override
	public int add(User t) {
		String sql = "INSERT INTO EmployeeLoginDetails VALUES (?,?,?)";
		int rowAdded = 0;
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, t.getEmpId());
			pstmt.setString(2, t.getPassword());
			pstmt.setString(3, t.getRole());
						
			rowAdded = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowAdded;
	}

	@Override
	public User find(int key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public int update(User u) {

		String sql = "UPDATE EmployeeLoginDetails SET password = ? , role = ? WHERE EmpId = ?";
		int rowUpdated=0;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			
			pstmt.setString(1, u.getPassword());
			pstmt.setString(2, u.getRole());
			pstmt.setInt(2, u.getEmpId());
			
			rowUpdated=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowUpdated;
	}
	
	@Override
	public int delete(int key) {
		String sql = "DELETE FROM EmployeeLoginDetails WHERE empId = ?";
		int rowDeleted=0;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, key);
			
			rowDeleted=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rowDeleted;
	}

}
