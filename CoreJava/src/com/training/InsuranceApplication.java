package com.training;
import java.util.Scanner;
public class InsuranceApplication {

	public static void main(String[] args) {
		
		LifeInsurance obj1 = new LifeInsurance();
		System.out.println("Premium : Rs. "+obj1.calculate());
		
		LifeInsurance obj2 = new LifeInsurance(65455,"Pritam","QTR",70000);
		System.out.println("Premium : Rs. "+obj2.calculate());
		
		LifeInsurance obj3 = new LifeInsurance(Long.parseLong(args[0]),args[1],args[2],Double.parseDouble(args[3]));
		System.out.println("Premium : Rs. "+obj3.calculate());
	
		//Using Scanner class
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Policy Number");
		long policyNumber2=sc.nextLong();
		
		System.out.println("Enter Policy Holder Name");
		String policyHolderName2 = sc.next();
		
		System.out.println("Enter Payment Mode");
		String paymentMode2 = sc.next();
		
		System.out.println("Enter Policy Amount");
		double policyAmount2 = sc.nextDouble();
		
		LifeInsurance obj4 = new LifeInsurance(policyNumber2, policyHolderName2, paymentMode2, policyAmount2);
		System.out.println(obj4.calculate());
		
		sc.close();
	}

}
