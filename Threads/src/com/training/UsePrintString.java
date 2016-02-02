package com.training;

public class UsePrintString implements Runnable {

	private  String str1,str2;
	
	
	
	public UsePrintString(String str1, String str2) {
		super();
		this.str1 = str1;
		this.str2 = str2;
		
		/*Instead of creating an object of Runnable class and passing it to a thread
		 * as done in the previous examples
		 * we directly pass the this pointer of the current runnable class to a thread*/
		Thread t = new Thread(this); 
		t.start();
		
	}



	public void run() {
		
		PrintString.print(str1, str2);
	}
}
