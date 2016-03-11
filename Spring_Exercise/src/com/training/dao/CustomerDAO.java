package com.training.dao;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.training.entity.Customer;
import com.training.ifaces.DAO;
import com.training.util.CustomerRowMapper;

public class CustomerDAO extends JdbcDaoSupport implements DAO<Customer> {

	@Override
	public int add(Customer t) {
		String sql = "INSERT INTO CustomerSpring VALUES (?,?,?,?)";
		int rowAdded = getJdbcTemplate().update(sql,t.getCustomerId(),t.getCustomerName(),
				t.getProduct().getProductId(),t.getCost());
		return rowAdded;
	}

	@Override
	public Customer find(int key) {
		String sql = "SELECT * FROM CustomerSpring WHERE CustomerId = ?";
		Customer cus =  getJdbcTemplate().queryForObject(sql,
				new CustomerRowMapper(),key);
		return cus;
	}

	@Override
	public List<Customer> findAll() {
		String sql = "SELECT * FROM CustomerSpring";
		
		List<Customer> cusList = getJdbcTemplate().query(sql,
									new CustomerRowMapper());
		return cusList;
	}

}
