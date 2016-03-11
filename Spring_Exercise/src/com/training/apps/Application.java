package com.training.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.dao.*;
import com.training.entity.Customer;
import com.training.entity.Product;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		
		ProductDAO pdao = ctx.getBean("pdao",ProductDAO.class);
		
		//Product p1 = ctx.getBean("product",Product.class);
		
		/*p1.setProductId(51);
		p1.setProductType("Mobile");
		p1.setDescription("Damaged Screen");*/
		
		//System.out.println(pdao.findAll());
		
		CustomerDAO cdao = ctx.getBean("cdao",CustomerDAO.class);
		
		Customer c1 = ctx.getBean("customer",Customer.class);
		
		c1.setCustomerId(101);
		c1.setCustomerName("Pritam");
		//c1.setProduct(p1);
		c1.setCost(500.0);
		
		cdao.add(c1);
		
		System.out.println(cdao.findAll());
		
		

	}

}
