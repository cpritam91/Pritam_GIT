package com.training.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Doctor;
import com.training.domains.HiberSpringExample;

public class Application {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		
		HiberSpringExample dao = ctx.getBean(HiberSpringExample.class);
		
		Doctor doc = new Doctor(652,"Sumit",9545487644L);

		//Integer key = (Integer)dao.add(doc);
		
		System.out.println(dao.findAll());
		
		//System.out.println("One Doctor with key "+key+" added.");

	}

}
