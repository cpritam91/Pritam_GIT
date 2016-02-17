package crea.strupattern.adapter;

public class BankAccount {
	
	private double principle;
	
	public BankAccount(double principle) {
		
		this.principle = principle;
	}
	
	public double calculate() {
		
		return principle * 0.10;
	}

}
