package com.training;

public class UserApplication {

	public static void main(String[] args) {
		
		ValidateUser vu = new ValidateUser();

		User us = new User("cpritam","pritam");
		
		boolean result = vu.checkUser(us);
		
		if(result) {
			System.out.println("Valid User!");
		}
		else {
			System.out.println("Invalid User!");
		}
	}

}
