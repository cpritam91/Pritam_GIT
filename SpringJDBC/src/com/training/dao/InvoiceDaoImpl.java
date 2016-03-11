package com.training.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.training.entity.Invoice;
import com.training.ifaces.MyDAO;
import com.training.utils.InvoiceRowMapper;

public class InvoiceDaoImpl extends JdbcDaoSupport implements MyDAO<Invoice> {

	@Override
	public int add(Invoice t) {
		
		String sql = "INSERT INTO Invoice VALUES (?,?,?)";
				int rowAdded = getJdbcTemplate().update(sql,t.getInvoiceNumber(),t.getCustomerName(),t.getAmount());
		return rowAdded;
	}

	@Override
	public Invoice find(int key) {
		String sql = "SELECT * FROM Invoice WHERE InvoiceNumber = ?";
		/*Invoice inv = getJdbcTemplate().queryForObject(sql,
				new BeanPropertyRowMapper<Invoice>(Invoice.class),key);*/
		
		Invoice inv = getJdbcTemplate().queryForObject(sql,
				new InvoiceRowMapper(),key);
		return inv;
	}

	@Override
	public List<Invoice> findAll() {
		String sql = "SELECT * FROM Invoice";
		
		List<Invoice> invList = getJdbcTemplate().query(sql,
									new BeanPropertyRowMapper(Invoice.class));
		return invList;
	}
}
