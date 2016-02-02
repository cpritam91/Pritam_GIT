package com.training;

public class InsuranceManager {

	public static void printPremiums(LifeInsurance policies[]){ //array to accept any no. of arguments
		
		for(LifeInsurance ins: policies)
		{
			System.out.println(ins);
			System.out.println("Premium : "+ins.calculate());
		}
	}
	
}
