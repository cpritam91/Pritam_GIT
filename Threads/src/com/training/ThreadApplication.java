package com.training;

public class ThreadApplication {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());
		
		MyThread obj = new MyThread();
		
		obj.setName("Printing Thread");
		
		obj.start();

	}

}
