package com.training.handson;

public class BankAccount {

	private int accNo;
	private String accHolderName;
	private double balance;
	
	public BankAccount() {
					
	}

	public BankAccount(int accNo, String accHolderName, double balance){
		super();
		if(accHolderName != null) {
			this.accNo = accNo;
			this.accHolderName = accHolderName;
			this.balance = balance;
		}
		else
			throw new NullPointerException();
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double deposit(double amountDeposited)	{
		balance += amountDeposited;
		return balance;
	}
	public double withdraw(double amountWithdrawn) {
		balance += amountWithdrawn;
		return balance;
	}
}
