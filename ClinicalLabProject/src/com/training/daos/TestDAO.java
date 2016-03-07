package com.training.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.entities.Test;
import com.training.ifaces.DAO;
import com.training.utils.SQLConnection;

public class TestDAO implements DAO<Test> {

	private Connection con;
	
	public TestDAO() {
		con = SQLConnection.getOracleConnection();
	}
	
	public TestDAO(Connection con) {
		this.con = con;
	}

	@Override
	public int add(Test t) {
		String sql = "insert into Test values(?,?,?)";
		int rowAdded = 0;
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, t.getCode());
			pstmt.setString(2, t.getTestName());
			pstmt.setDouble(3, t.getAmount());
			
			rowAdded = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowAdded;
	}
	private Test getTest(ResultSet rs) {
		
		Test test = null;
		
		
		try {
			String tCode = rs.getString("testCode");
			String tName = rs.getString("testName");
			Double amt = rs.getDouble("amount");
			
			test = new Test(tCode,tName,amt);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return test;
	}

	@Override
	public Test find(Object k) {
		Test t = null;
		String key = k.toString();
		String sql = "Select * from Test where testCode = ?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, key);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				t = getTest(rs);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return t;
	}

	@Override
	public List<Test> findAll() {
		ArrayList<Test> patList = new ArrayList<Test>();
		try {
			String sql = "SELECT * FROM Test";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Test us = getTest(rs);
				patList.add(us);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return patList;
	}

	@Override
	public int update(Test t) {
		int rowUpdated = 0;
		String sql = "UPDATE Test SET testName = ?, Amount = ? WHERE testCode = ?";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, t.getTestName());
			pstmt.setDouble(2, t.getAmount());
			pstmt.setString(3, t.getCode());
			
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
		String sql = "DELETE FROM Test WHERE testCode = ?";
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
