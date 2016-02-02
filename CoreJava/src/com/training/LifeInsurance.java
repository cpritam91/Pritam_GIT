package com.training;

public class LifeInsurance {

	private long policyNumber;
	private String policyHolderName;
	private String paymentMode;
	private double policyAmount;

	
	{
		System.out.println("Initialization Block Called");
	}
	static{
		System.out.println("Static Block Called");
	}
	
	

	public LifeInsurance() {
		super();
		System.out.println("Non-parameterized Constructor Called");
	}

	public LifeInsurance(long policyNumber, String policyHolderName, String paymentMode, double policyAmount) {
		super();
		System.out.println("Parameterized Constructor Called");
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.paymentMode = paymentMode;
		this.policyAmount = policyAmount;
	}

	public long getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(long policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public double getPolicyAmount() {
		return policyAmount;
	}

	public void setPolicyAmount(double policyAmount) {
		this.policyAmount = policyAmount;
	}
	
	public double calculate()
	{
		
		return this.policyAmount*0.10;
	}
	@Override
	public String toString() { //Can't put incompatible return type or reduce visibility
		
		return this.policyNumber + ":" + this.policyHolderName ;
		//return super.toString();
	}

	@Override
	public int hashCode() {
		
		long code = this.policyNumber + 7 * policyNumber;
		
		return (int)code;
	}

	@Override
	public boolean equals(Object obj) {
		
		//Checking for Identity
		if(this == obj)	return true;
		
		//Cautious
		if(obj == null)	return false;
		
		//Checking the type of Object
		if(this.getClass() != obj.getClass()) return false;
		
		//Casting
		LifeInsurance ins = (LifeInsurance)obj;
		
		return policyNumber==ins.policyNumber && 
				policyHolderName.equals(ins.policyHolderName);
	}
	
}
