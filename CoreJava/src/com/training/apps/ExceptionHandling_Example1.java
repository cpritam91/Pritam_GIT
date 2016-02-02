package com.training.apps;

public class ExceptionHandling_Example1 {

	public static void main(String[] args) {

		int len;
		String name = null;
		try{
			
		System.out.println(args[0]);
		System.out.println(name.length());
		len=name.length();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Use Run Config To Enter Command Line Argument.");
		}
		catch(NullPointerException e)
		{
			System.out.println("Check Attribute Name - It may be NULL.");
		}
	}

}
