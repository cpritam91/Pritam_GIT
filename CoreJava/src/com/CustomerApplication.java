package com;

public class CustomerApplication {

	public static void main(String[] args) {

		Customer cust1 = new Customer();// Zero Argument Constructor
		
		cust1.setCustomerId(101);
		cust1.setCustomerName("Ramesh");
		cust1.setEmail_Id("ram@abc.com");
		cust1.setHandPhone(98785465);
		
		//Customer cust2 = new Customer(102,"Rajesh","raj@abc.com",98765434);// Parameterized Constructor
		
		System.out.println(cust1.showCustomer());
		//System.out.println(cust2.showCustomer());
	}

}
