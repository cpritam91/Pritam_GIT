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
		
		Doctor doc = new Doctor(655,"Pritam",9878787644L);
		
		System.out.println(dao.findAll());
		//Integer key = (Integer)dao.add(doc);
		
		//System.out.println("One Doctor with key "+key+" added.");

	}

}
