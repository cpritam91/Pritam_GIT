package com;

import com.myexceptions.RangeCheckException;

public class ExceptionApplication {

	public static void main(String[] args) {

		try {
			Customer cust = new Customer(101, "Ramesh", "ram@abc.com", 2342);
		} catch (RangeCheckException e) {
			//e.printStackTrace();
			System.out.println("Should Be a 10 Digit Number.");//return;
		}
		finally
		{//Executes with or without exception
			System.out.println("This is the finally block!!");
		}

		System.out.println("Last Line");
	}

}