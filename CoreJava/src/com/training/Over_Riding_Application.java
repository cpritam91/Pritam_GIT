package com.training;

public class Over_Riding_Application {

	public static void main(String[] args) {

		LifeInsurance ins1 = new LifeInsurance(101,"Ramesh","QTR",9000);
		LifeInsurance ins2 = new LifeInsurance(101,"Ramesh","QTR",9000);
		LifeInsurance ins3 = ins1;
		System.out.println(ins1.equals(ins3));//true Identity
		
		System.out.println(ins1.equals(ins2));//true Exact value

		System.out.println(ins1.equals(null));//false Check with Null

		System.out.println(ins1.equals("Pritam"));//False. different class
		// System.out.println(ins.toString());//It is called by default when we try to print an object.
		
		//We will override toString()

		
		
	}

}
