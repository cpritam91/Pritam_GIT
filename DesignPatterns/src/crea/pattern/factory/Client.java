package crea.pattern.factory;

public class Client {
	
	public static void main(String[] args) {
		
		LoanAccount hl = LoanFactory.createInstance(Loan.HOUSINGLOAN);
		LoanAccount pl = LoanFactory.createInstance(Loan.PERSONALLOAN);
		
		System.out.println(hl);
		System.out.println(pl);
	}

}
