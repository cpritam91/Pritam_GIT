package crea.strupattern.adapter;

public class Client {

	public static void main(String[] args) {

		BankAccountAdapter adapter = 
				new BankAccountAdapter(80000, new LifeInsurance(100000));

		double totalDue = adapter.findTotalDue();
		
		System.out.println("Total Due := " + totalDue);
	}

}
