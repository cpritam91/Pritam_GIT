package com.training.apps;

public class ExceptionHandling_Example2 {

	public static void main(String[] args) {
		
		try{
			String name= null;
			String age = "40";
			int age2 = Integer.parseInt(age);
			System.out.println(name.length());
			System.out.println(++age2);
		}
		catch(NumberFormatException | NullPointerException e){
			if(e instanceof NumberFormatException)
				System.out.println(e.getMessage() + " Age should be Integer Value");
			else
				System.out.println(e.getMessage());
		}
	}

}
