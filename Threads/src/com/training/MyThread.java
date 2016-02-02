package com.training;

public class MyThread extends Thread {

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName());
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello World");
		}
	}

}
