package com.training.apps;

import java.util.Map;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Invoice;

public class AutoWireApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext container = new ClassPathXmlApplicationContext("AutoWire.xml");

		Invoice inv = container.getBean("invBean", Invoice.class);
		
		Map<String,Double> tax = inv.getTax();
		for (Map.Entry<String,Double> entry : tax.entrySet()) {
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
		//System.out.println(inv);
		container.close();
	}

}
