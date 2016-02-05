package com.training.daos;

import com.training.ifaces.DAO;
import com.training.utils.SQLConnection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.training.entity.*;
import java.sql.*;

public class CustomerDAO implements DAO<Customer> {

	private Connection con;
	
	public CustomerDAO(Connection con) {
		super();
		this.con = con;
	}

	public CustomerDAO() {
		super();
		con = SQLConnection.getOracleConnection();
	}

	@Override
	public int add(Customer t) {

		String sql = "insert into customer values(?,?,?,?)";
		int rowAdded = 0;
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, t.getCustomerId());
			pstmt.setString(2, t.getCustomerName());
			pstmt.setString(3, t.getEmail_Id());
			pstmt.setLong(4, t.getHandPhone());
			
			rowAdded = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowAdded;
	}

	@Override
	public Customer find(int key) {

		Customer cus = null;
		String sql = "SELECT * FROM Customer WHERE CustomerId = ?";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, key);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				cus = getCustomer(rs);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return cus;
	}
	
	private Customer getCustomer(ResultSet rs) {
		
		Customer cus = null;
		
		int customerId;
		try {
			customerId = rs.getInt("CustomerId");
			String customerName = rs.getString("CustomerName");
			long phoneNumber = rs.getLong("handPhone");
			String email = rs.getString("email_Id");
			
			cus = new Customer(customerId, customerName,email,phoneNumber);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return cus;
	}

	@Override
	public List<Customer> findAll() {
		
		String sql = "SELECT * FROM Customer";
	
		ArrayList<Customer> list = new ArrayList<Customer>();
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Customer cus = getCustomer(rs);
				list.add(cus);
			}
			
			
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public int delete(int key) {

		String sql = "DELETE FROM Customer WHERE CustomerId = ?";
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


	@Override
	public int update(int key) {
		
		String sql = "UPDATE Customer SET handPhone = ? WHERE CustomerId = ?";
		int rowUpdated=0;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter new Hand phone number : ");
			long newphn = sc.nextLong();
			sc.close();
			pstmt.setLong(1, newphn);
			pstmt.setInt(2, key);
			
			rowUpdated=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowUpdated;
	}
}
