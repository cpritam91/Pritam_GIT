package com.training;

public class Customer {

	private String Name;
	private int Salary;
	private double Jewel_Grams;
	
		
	public Customer() {
		super();
	}

	public Customer(String name, int salary, float jewel_Grams) {
		super();
		Name = name;
		Salary = salary;
		Jewel_Grams = jewel_Grams;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public double getJewel_Grams() {
		return Jewel_Grams;
	}

	public void setJewel_Grams(double jewel_Grams) {
		Jewel_Grams = jewel_Grams;
	}

	
	
}
