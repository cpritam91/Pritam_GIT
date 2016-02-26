package com.training.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.entity.Table;
import com.training.ifaces.DAO;
import com.training.utils.SQLConnection;

public class TableDAO implements DAO<Table> {

	private Connection con;
	
	public TableDAO(Connection con) {
		super();
		this.con = con;
	}

	public TableDAO() {
		super();
		con = SQLConnection.getOracleConnection();
	}
	
	
	@Override
	public int add(Table t) {
		String sql = "INSERT INTO WaiterTable VALUES (?,?)";
		int rowAdded = 0;
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, t.getTableNo());
			pstmt.setInt(2, t.getWaiterId());
			
			rowAdded = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowAdded;
	}

	@Override
	public Table find(int key) {
		Table it = null;
		String sql = "SELECT * FROM WaiterTable WHERE TableNo = ?";
		
		try {
				PreparedStatement pstmt = con.prepareStatement(sql);
				
				pstmt.setInt(1, key);
				
				ResultSet rs = pstmt.executeQuery();
				
				while(rs.next()) {
					it = getTable(rs);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return it;
	}
	
	private Table getTable(ResultSet rs) {
		
		Table it = null;
		
		try {
			int tbno = rs.getInt("TableNo");
			int empid = rs.getInt("WaiterId");
			
			it = new Table(tbno,empid);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return it;
	}

	@Override
	public List<Table> findAll() {
		
		String sql = "SELECT * FROM WaiterTable";
		
		ArrayList<Table> list = new ArrayList<Table>();
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Table it = getTable(rs);
				list.add(it);
			}
			
			
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public int update(Table t) {
		String sql = "UPDATE WaiterTable SET WaiterId = ? WHERE TableNo = ?";
		int rowUpdated=0;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			
			pstmt.setInt(1, t.getWaiterId());
			pstmt.setInt(2, t.getTableNo());
			
			rowUpdated=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowUpdated;
	}

	@Override
	public int delete(int key) {
		String sql = "DELETE FROM WaiterTable WHERE TableNo = ?";
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
