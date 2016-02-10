package com.training.handson;

public class BankAccount {

	private Integer accNo;
	private String accHolderName;
	private Double balance;
	
	public BankAccount() {
					
	}

	public BankAccount(Integer accNo, String accHolderName, Double balance){
		super();
		if(accHolderName != null && accNo != null && balance != null) {
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
		if(balance >= amountWithdrawn)
			balance -= amountWithdrawn;
		//while(true) {}
		return balance;
	}
}
