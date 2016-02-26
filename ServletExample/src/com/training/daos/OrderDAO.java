package com.training.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.entity.Order;
import com.training.ifaces.DAO;
import com.training.utils.SQLConnection;

public class OrderDAO implements DAO<Order> {

	private Connection con;
	
	public OrderDAO(Connection con) {
		super();
		this.con = con;
	}

	public OrderDAO() {
		super();
		con = SQLConnection.getOracleConnection();
	}
	
	
	@Override
	public int add(Order t) {

		String sql = "INSERT INTO ORDERS Values (?,?,?,?,?)";
		
		int rowAdded = 0;
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, t.getOrderId());
			pstmt.setInt(2, t.getBillNo());
			pstmt.setDouble(3, t.getItemId());
			pstmt.setInt(4, t.getQuantity());
			pstmt.setString(5, t.isReady()?"YES":"NO");
						
			rowAdded = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowAdded;
		
	}

	@Override
	public Order find(int key) {

		Order it = null;
		String sql = "SELECT * FROM ORDERS WHERE OrderId = ?";
		
		try {
				PreparedStatement pstmt = con.prepareStatement(sql);
				
				pstmt.setInt(1, key);
				
				ResultSet rs = pstmt.executeQuery();
				
				while(rs.next()) {
					it = getOrder(rs);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return it;
		
	}

	private Order getOrder(ResultSet rs) {
		
		Order it = null;
		
		try {
			int orderId = rs.getInt("orderId");
			int billNo = rs.getInt("billNo");
			int itemId = rs.getInt("itemId");
			int quantity = rs.getInt("quantity");
			boolean isReady = rs.getString("Ready").equals("YES")?true:false;
			
			it = new Order(orderId, billNo, itemId, quantity, isReady);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return it;
	}
	
	@Override
	public List<Order> findAll() {
		String sql = "SELECT * FROM Orders";
		
		ArrayList<Order> list = new ArrayList<Order>();
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Order it = getOrder(rs);
				list.add(it);
			}
			
			
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		
		return list;

	}
	
	public ArrayList<Order> findOrder(int BillNo) {
		String sql = "SELECT * FROM Orders WHERE BillNo = ?";
		
		ArrayList<Order> list = new ArrayList<Order>();
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, BillNo);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Order it = getOrder(rs);
				list.add(it);
			}
			
			
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		
		return list;

	}
	

	@Override
	public int update(Order t) {
		String sql = "UPDATE ORDERS SET BillNo = ? , ItemId = ?, Quantity = ?, Ready = ? WHERE OrderId = ?";
		int rowUpdated=0;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, t.getBillNo());
			pstmt.setDouble(2, t.getItemId());
			pstmt.setInt(3, t.getQuantity());
			pstmt.setString(4, t.isReady()?"YES":"NO");

			pstmt.setInt(5, t.getOrderId());
			
			rowUpdated=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowUpdated;
	}

	@Override
	public int delete(int key) {
		String sql = "DELETE FROM Orders WHERE OrderId = ?";
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
	
	public ArrayList<Order> findIncompleteOrder() {
		
		ArrayList<Order> list = new ArrayList<Order>();
		String sql = "SELECT * FROM Orders WHERE READY=\'NO\'";
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Order it = getOrder(rs);
				list.add(it);
			}
			
			
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		
		return list;

	}
}
