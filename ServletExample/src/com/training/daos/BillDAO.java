package com.training.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.training.entity.Bill;
import com.training.ifaces.DAO;
import com.training.utils.SQLConnection;

public class BillDAO implements DAO<Bill> {

	private Connection con;
	
	public BillDAO(Connection con) {
		super();
		this.con = con;
	}

	public BillDAO() {
		super();
		con = SQLConnection.getOracleConnection();
	}
	
	
	@Override
	public int add(Bill t) {
		
		String sql = "INSERT INTO BILL Values (?,?,?,?,?,?)";
		
		int rowAdded = 0;
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, t.getBillNo());
			pstmt.setInt(2, t.getTableNo());
			pstmt.setString(3, t.getCustomerName());
			pstmt.setInt(4, t.getNoOfCustomers());
			pstmt.setTimestamp(5, t.getTime());
			pstmt.setDouble(6, t.getAmount());
			
						
			rowAdded = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowAdded;

	}

	private Bill getBill(ResultSet rs) {
		
		Bill it = null;
		
		try {
			int billNo = rs.getInt("BillNo");
			int tableNo = rs.getInt("TableNo");
			String cusName = rs.getString("CusName");
			int diners = rs.getInt("NoOfDiners");
			Timestamp t = rs.getTimestamp("Time");
			double amt = rs.getDouble("Amount");
			
			it = new Bill(billNo, tableNo, cusName, diners, t, amt);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return it;
	}
	
	@Override
	public Bill find(int key) {
		Bill it = null;
		String sql = "SELECT * FROM Bill WHERE BillNo = ?";
		
		try {
				PreparedStatement pstmt = con.prepareStatement(sql);
				
				pstmt.setInt(1, key);
				
				ResultSet rs = pstmt.executeQuery();
				
				while(rs.next()) {
					it = getBill(rs);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return it;
	}

	@Override
	public List<Bill> findAll() {
		String sql = "SELECT * FROM Bill";
		
		ArrayList<Bill> list = new ArrayList<Bill>();
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Bill it = getBill(rs);
				list.add(it);
			}
			
			
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public int update(Bill t) {
		String sql = "UPDATE BILL SET TableNo = ? , CusName = ?, NoOfDiners = ?, Time = ?, Amount = ? WHERE BillNo = ?";
		int rowUpdated=0;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			
			pstmt.setInt(1, t.getTableNo());
			pstmt.setString(2, t.getCustomerName());
			pstmt.setInt(3, t.getNoOfCustomers());
			pstmt.setTimestamp(4, t.getTime());
			pstmt.setDouble(5, t.getAmount());
			
			pstmt.setInt(6, t.getBillNo());
			
			rowUpdated=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowUpdated;
	}

	@Override
	public int delete(int key) {
		String sql = "DELETE FROM Bill WHERE BillNo = ?";
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
