package com.training;

public class InsuranceManagerApplication {

	public static void main(String[] args) {

		LifeInsurance ins1 = new LifeInsurance(101, "Ramesh", "QTR", 450000);
		LifeInsurance ins2 = new LifeInsurance(102, "Rajesh", "HLF", 320000);
		LifeInsurance ins3 = new LifeInsurance(103, "Rakesh", "ANN", 500000);
		LifeInsurance ins4 = new LifeInsurance(104, "Rangesh", "QTR",600000);

		LifeInsurance list[] = new LifeInsurance[4];
		
		list[0] = ins1;
		list[1] = ins2;
		list[2] = ins3;
		list[3] = ins4;
		
		/* NORMAL WAY
		InsuranceManager obj = new InsuranceManager();
		obj.printPremiums(list);*/
		
		/*STATIC WAY*/
		InsuranceManager.printPremiums(list);
	}

}
