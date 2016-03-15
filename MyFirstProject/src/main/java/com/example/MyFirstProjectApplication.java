package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyFirstProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(MyFirstProjectApplication.class, args);
		Customer c =ctx.getBean(Customer.class);
		System.out.println("Customer Details : " + c);
	}
}
