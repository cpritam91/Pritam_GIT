package com.training.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.entities.Patient;
import com.training.ifaces.DAO;
import com.training.utils.SQLConnection;

public class PatientDAO implements DAO<Patient> {

	private Connection con;
	
	public PatientDAO() {
		con = SQLConnection.getOracleConnection();
	}
	
	public PatientDAO(Connection con) {
		this.con = con;
	}

	@Override
	public int add(Patient t) {
		String sql = "insert into Patient values(?,?,?,?,?,?)";
		int rowAdded = 0;
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, t.getPatientCode());
			pstmt.setString(2, t.getPatientName());
			pstmt.setInt(3, t.getAge());
			pstmt.setLong(4, t.getHandPhone());
			pstmt.setString(5, t.getEmail());
			pstmt.setString(6, t.getGender());
			
			rowAdded = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowAdded;
	}
	
	private Patient getPatient(ResultSet rs) {
		
		Patient pat = null;
		
		
		try {
			Integer pCode = rs.getInt("patientCode");
			String pName = rs.getString("patientName");
			Integer age = rs.getInt("age");
			Long phone = rs.getLong("handPhone");
			String email = rs.getString("email");
			String gender = rs.getString("gender");
			
			pat = new Patient(pCode,pName,age,phone,email,gender);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pat;
	}
	
	@Override
	public Patient find(Object k) {
		Patient pat = null;
		Integer key = (Integer)k;
		String sql = "Select * from Patient where patientCode = ?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, key);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				pat = getPatient(rs);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return pat;
	}

	@Override
	public List<Patient> findAll() {
		ArrayList<Patient> patList = new ArrayList<Patient>();
		try {
			String sql = "SELECT * FROM Patient";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Patient us = getPatient(rs);
				patList.add(us);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return patList;
	}

	@Override
	public int update(Patient t) {
		int rowUpdated = 0;
		String sql = "UPDATE Patient SET patientName = ?, Age = ?, handPhone = ?, email = ?, gender = ? WHERE patientCode = ?";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, t.getPatientName());
			pstmt.setInt(2, t.getAge());
			pstmt.setLong(3, t.getHandPhone());
			pstmt.setString(4, t.getEmail());
			pstmt.setString(5, t.getGender());
			pstmt.setInt(6, t.getPatientCode());
			
			rowUpdated = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowUpdated;
	}

	@Override
	public int delete(Object k) {
		Integer key = (Integer)k;
		int rowDeleted = 0;
		String sql = "DELETE FROM Patient WHERE patientCode = ?";
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, key);
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
