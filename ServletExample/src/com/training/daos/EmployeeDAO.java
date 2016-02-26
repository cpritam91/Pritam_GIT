package com.training.daos;

import java.sql.*;
import java.util.*;

import com.training.entity.*;
import com.training.ifaces.DAO;
import com.training.utils.*;

public class EmployeeDAO implements DAO<Employee>{

	private Connection con;
	
	public EmployeeDAO(Connection con) {
		super();
		this.con = con;
	}

	public EmployeeDAO() {
		super();
		con = SQLConnection.getOracleConnection();
	}
	
	@Override
	public int add(Employee emp) {
		
		String sql = "INSERT INTO Employee VALUES (?,?,?,?,?)";
		int rowAdded = 0;
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmpId());
			pstmt.setString(2, emp.getEmpName());
			pstmt.setDouble(3, emp.getSalary());
			if(emp.isEnabled())
				pstmt.setString(5, "Enabled");
			else
				pstmt.setString(5, "Disabled");
			pstmt.setLong(4, emp.getMobNo());
			
			
			rowAdded = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowAdded;
	}

	@Override
	public Employee find(int key) {
		Employee emp = null;
		String sql = "SELECT * FROM Employee WHERE EmpId = ?";
		
		try {
				PreparedStatement pstmt = con.prepareStatement(sql);
				
				pstmt.setInt(1, key);
				
				ResultSet rs = pstmt.executeQuery();
				
				while(rs.next()) {
					emp = getEmployee(rs);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return emp;
	}

	private Employee getEmployee(ResultSet rs) {
		
		Employee emp = null;
		
		int empId;
		try {
			empId = rs.getInt("EmpId");
			String empName = rs.getString("EmpName");
			long mobNumber = rs.getLong("MobNo");
			double salary = rs.getDouble("Salary");
			String status = rs.getString("Status");
			boolean isEnabled = false;
			if(status.equals("Enabled"))
			
			emp = new Employee(empId, empName,salary,mobNumber,isEnabled);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return emp;
	}
	
	@Override
	public List<Employee> findAll() {
		String sql = "SELECT * FROM Employee";
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Employee emp = getEmployee(rs);
				list.add(emp);
			}
			
			
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public int update(Employee emp) {
		String sql = "UPDATE Employee SET EmpName = ? , Salary = ?, MobNo = ?, Status = ? WHERE EmpId = ?";
		int rowUpdated=0;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			
			pstmt.setString(1, emp.getEmpName());
			pstmt.setDouble(2, emp.getSalary());
			pstmt.setLong(3, emp.getMobNo());
			if(emp.isEnabled())
				pstmt.setString(4, "Enabled");
			else
				pstmt.setString(4, "Disabled");
			pstmt.setInt(2, emp.getEmpId());
			
			rowUpdated=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowUpdated;
	}

	@Override
	public int delete(int key) {
		String sql = "DELETE FROM Employee WHERE empId = ?";
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
