package com.training.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HiberUtils {

	private static SessionFactory factory;
	
	//Static Block(Factory) Singleton Design Pattern
	
	static {
		try {
			factory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable e) {
			throw new ExceptionInInitializerError();
		}
	}

	public static SessionFactory getFactory() {
		return factory;
	}
}
