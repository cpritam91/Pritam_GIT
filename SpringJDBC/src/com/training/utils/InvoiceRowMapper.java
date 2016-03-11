package com.training.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.training.entity.Invoice;

public class InvoiceRowMapper implements RowMapper<Invoice> {

	@Override
	public Invoice mapRow(ResultSet rs, int rowCount) throws SQLException {
		
		Invoice inv = new Invoice();
		
		inv.setInvoiceNumber(rs.getInt("InvoiceNumber"));
		inv.setCustomerName(rs.getString("CustomerName"));
		inv.setAmount(rs.getFloat("InvoiceAmount"));
		return inv;
	}

}
