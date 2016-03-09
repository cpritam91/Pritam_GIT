package com.training.apps;

import java.util.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Invoice;

public class AutoWireApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		BeanFactory container = new ClassPathXmlApplicationContext("AutoWire.xml");

		Invoice inv = container.getBean("invBean", Invoice.class);
		
		Map<String,Double> tax = inv.getTax();
		for (Map.Entry<String,Double> entry : tax.entrySet()) {
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
		//System.out.println(inv);
	}

}
