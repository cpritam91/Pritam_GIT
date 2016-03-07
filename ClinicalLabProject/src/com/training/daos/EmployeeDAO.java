package com.training.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.entities.Employee;
import com.training.ifaces.DAO;
import com.training.utils.SQLConnection;

public class EmployeeDAO implements DAO<Employee> {

private Connection con;
	
	public EmployeeDAO() {
		con = SQLConnection.getOracleConnection();
	}
	
	public EmployeeDAO(Connection con) {
		this.con = con;
	}
	@Override
	public int add(Employee t) {
		String sql = "insert into Employee values(?,?,?,?,?)";
		int rowAdded = 0;
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, t.getEmpId());
			pstmt.setString(2, t.getEmpName());
			pstmt.setString(3, t.getAddress());
			pstmt.setLong(4, t.getPhone());
			pstmt.setDouble(5, t.getSalary());
			
			rowAdded = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowAdded;
	}

	@Override
	public Employee find(Object k) {
		Employee emp = null;
		Integer key = (Integer)k;
		String sql = "Select * from Employee where empId = ?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, key);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				emp = getEmployee(rs);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return emp;
	}
	
	private Employee getEmployee(ResultSet rs) {
		
		Employee user = null;
		
		
		try {
			Integer empId = rs.getInt("empId");
			String empName = rs.getString("empName");
			String address = rs.getString("address");
			Long phone = rs.getLong("phone");
			Double salary = rs.getDouble("salary");
			
			user = new Employee(empId,empName,address,phone,salary);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	
	@Override
	public List<Employee> findAll() {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		try {
			String sql = "SELECT * FROM Employee";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Employee us = getEmployee(rs);
				empList.add(us);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return empList;
	}

	@Override
	public int update(Employee t) {
		int rowUpdated = 0;
		String sql = "UPDATE Employee SET EmpName = ?, Address = ?, Phone = ?, Salary = ? WHERE empId = ?";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, t.getEmpName());
			pstmt.setString(2, t.getAddress());
			pstmt.setLong(3, t.getPhone());
			pstmt.setDouble(4, t.getSalary());
			pstmt.setInt(5, t.getEmpId());
			
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
		String sql = "DELETE FROM Employee WHERE empId = ?";
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
