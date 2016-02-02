package com.training;

public class Loan {
	
	private double amount;
	private double interest;
	
	public Loan() {
		super();
	}
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public double calculateInterest(Customer cus)
	{
		return 0.0;
	}
	public double calculateLoanAmount(Customer cus)
	{
		return 0.0;
	}
}
