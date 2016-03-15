package com.training.apps;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Doctor;

public class SimpleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		
		Doctor d1 = ctx.getBean(Doctor.class);
		
		System.out.println(d1);
		
		Doctor d2 = ctx.getBean("ent",Doctor.class);
		
		System.out.println(d2);
				
		ctx.close();
		/*Doctor d3 = ctx.getBean("ent",Doctor.class);
		System.out.println(d3);*/
	}

}
