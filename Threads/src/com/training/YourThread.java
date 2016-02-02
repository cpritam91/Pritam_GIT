package com.training;

public class YourThread implements Runnable {

	double i=100;
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		
		for(int i=0;i<10;i++)
		{
			//System.out.println(Thread.currentThread().getName());
			System.out.println(calculate());
		}
		
	}
	
	public double calculate() {
		
		return ++i;
	}

}
