package com.training.entities;

public class Test {

	private String code;
	private String testName;
	private Double amount;
	public Test() {
		// TODO Auto-generated constructor stub
	}
	public Test(String code, String testName, Double amount) {
		super();
		this.code = code;
		this.testName = testName;
		this.amount = amount;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
}
