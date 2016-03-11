package com.training.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.RowMapper;

import com.training.dao.ProductDAO;
import com.training.entity.Customer;
import com.training.entity.Product;

public class CustomerRowMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowCount) throws SQLException {
		
		Customer cus = new Customer();
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		
		ProductDAO pdao = ctx.getBean("pdao",ProductDAO.class);
		
		
		cus.setCustomerId(rs.getInt("CustomerId"));
		cus.setCustomerName(rs.getString("CustomerName"));
		
		int pid = rs.getInt("ProductId");
		Product p1 = pdao.find(pid);
		cus.setProduct(p1);
		cus.setCost(rs.getDouble("Cost"));
		
		return cus;
	}

}
