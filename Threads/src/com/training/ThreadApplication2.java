package com.training;

public class ThreadApplication2 {
	
	public static void main(String args[]) {
		
		YourThread obj = new YourThread();
		
		Thread th1 = new Thread(obj,"Ram");
		Thread th2 = new Thread(obj,"Shyam");
		Thread th3 = new Thread(obj,"Ganesh");
		
		th1.start();
		th2.start();
		th3.start();
		
	}

}
