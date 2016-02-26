package com.training.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.entity.*;
import com.training.ifaces.DAO;
import com.training.utils.SQLConnection;

public class ItemDAO implements DAO<Item> {

	private Connection con;
	
	public ItemDAO(Connection con) {
		super();
		this.con = con;
	}

	public ItemDAO() {
		super();
		con = SQLConnection.getOracleConnection();
	}
	
	@Override
	public int add(Item t) {
		String sql = "INSERT INTO Item VALUES (?,?,?,?,?,?)";
		int rowAdded = 0;
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, t.getItemId());
			pstmt.setString(2, t.getItemName());
			pstmt.setDouble(3, t.getPrice());
			pstmt.setString(4, t.getCategory());
			pstmt.setString(5, t.isInStock()?"YES":"NO");
			pstmt.setString(6, t.isVeg()?"VEG":"NON-VEG");
						
			rowAdded = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowAdded;
	}

	@Override
	public Item find(int key) {
		Item it = null;
		String sql = "SELECT * FROM Item WHERE ItemId = ?";
		
		try {
				PreparedStatement pstmt = con.prepareStatement(sql);
				
				pstmt.setInt(1, key);
				
				ResultSet rs = pstmt.executeQuery();
				
				while(rs.next()) {
					it = getItem(rs);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return it;
	}
	
	private Item getItem(ResultSet rs) {
		
		Item it = null;
		
		int itId;
		try {
			itId = rs.getInt("ItemId");
			String itName = rs.getString("ItemName");
			double price = rs.getDouble("Price");
			String category = rs.getString("Category");
			boolean inStock = rs.getString("InStock").equals("YES")?true:false;
			boolean isVeg = rs.getString("Veg_Nonveg").equals("VEG")?true:false;
			
			it = new Item(itId, itName, price, category, inStock, isVeg);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return it;
	}

	@Override
	public List<Item> findAll() {
		String sql = "SELECT * FROM Item";
		
		ArrayList<Item> list = new ArrayList<Item>();
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Item it = getItem(rs);
				list.add(it);
			}
			
			
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		
		return list;

	}

	@Override
	public int update(Item t) {
		String sql = "UPDATE Item SET ItemName = ? , Price = ?, Category = ?, InStock = ? , VEG_NONVEG = ? WHERE ItemId = ?";
		int rowUpdated=0;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			
			pstmt.setString(1, t.getItemName());
			pstmt.setDouble(2, t.getPrice());
			pstmt.setString(3, t.getCategory());
			pstmt.setString(4, t.isInStock()?"YES":"NO");
			pstmt.setString(5, t.isVeg()?"VEG":"NON-VEG");
				
			pstmt.setInt(6, t.getItemId());
			
			rowUpdated=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowUpdated;
	}

	@Override
	public int delete(int key) {
		String sql = "DELETE FROM Item WHERE ItemId = ?";
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

	public Item returnPrice(int key) {
		String sql = "SELECT * FROM Item WHERE ItemId = ?";
		Item it =null;
		ResultSet rs;
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, key);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				it = getItem(rs);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return it;
	}
}
