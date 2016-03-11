package com.training.apps;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.dao.InvoiceDaoImpl;
import com.training.entity.Invoice;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		
		InvoiceDaoImpl idao = ctx.getBean("dao",InvoiceDaoImpl.class);
		
		Invoice inv = ctx.getBean("invoice",Invoice.class);
		
		inv.setInvoiceNumber(102);
		inv.setCustomerName("Priyam");
		inv.setAmount(1024.0);
		
		//int res = idao.add(inv);
		
		List<Invoice> inv1 = idao.findAll();
		System.out.println(inv1);
		
	}

}
