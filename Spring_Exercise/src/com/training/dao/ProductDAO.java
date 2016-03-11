package com.training.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.training.entity.Product;
import com.training.ifaces.DAO;

public class ProductDAO extends JdbcDaoSupport implements DAO<Product> {

	@Override
	public int add(Product t) {
		String sql = "INSERT INTO ProductSpring VALUES (?,?,?)";
		int rowAdded = getJdbcTemplate().update(sql,t.getProductId(),t.getProductType(),t.getDescription());
		return rowAdded;
	}

	@Override
	public Product find(int key) {
		String sql = "SELECT * FROM ProductSpring WHERE ProductId = ?";
		Product prod = getJdbcTemplate().queryForObject(sql,
				new BeanPropertyRowMapper<Product>(Product.class),key);
		return prod;
	}

	@Override
	public List<Product> findAll() {
		String sql = "SELECT * FROM ProductSpring";
		
		List<Product> prodList = getJdbcTemplate().query(sql,
									new BeanPropertyRowMapper<Product>(Product.class));
		return prodList;
	}

}
