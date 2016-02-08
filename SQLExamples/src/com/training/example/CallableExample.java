package com.training.example;

import java.sql.*;

public class CallableExample {

	public static void main(String[] args) {

		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:system/password@localhost:1521:XE";
			
			Connection con = DriverManager.getConnection(url);
			
			CallableStatement stmt = con.prepareCall("call updatePhoneNumber(?,?,?)");
			
			stmt.setInt(1, 104);
			stmt.setLong(2, 9862912393L);
			
			stmt.registerOutParameter(3, java.sql.Types.NUMERIC); //Out Parameter
			
			stmt.execute();
			
			int count =stmt.getInt(3); 
			
			System.out.println("Thanks for updating phone number");
			System.out.println(count + " Row[s] updated");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
