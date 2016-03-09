package com.training.apps;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Customer;

public class InjectSimpleValues {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		BeanFactory container = new ClassPathXmlApplicationContext("bean.xml");
		
		Customer cust1 = (Customer)container.getBean("custBean1");		
		System.out.println("Customer 1 : " + cust1);
		System.out.println("Customer 1 Address : " + cust1.getAddress());
		System.out.println("Hash Code Customer 1 : " +cust1.hashCode());
		
		Customer cust2 = container.getBean("custBean1", Customer.class);		
		System.out.println("Customer 2 : " + cust2);
		System.out.println("Customer 2 Address : " + cust2.getAddress());
		System.out.println("Hash Code Customer 2 : " +cust2.hashCode());
		
		Customer cust3 = container.getBean(Customer.class);		
		System.out.println("Customer 3 : " + cust3);	
		System.out.println("Customer 3 Address : " + cust3.getAddress());	
		System.out.println("Hash Code Customer 3 : " +cust3.hashCode());
	}
}
