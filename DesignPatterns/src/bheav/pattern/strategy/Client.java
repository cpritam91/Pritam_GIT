package bheav.pattern.strategy;

public class Client {

	public static void main(String[] args) {
		
		BillPayment bill = new BillPayment();
		bill.setStrategy(new CardPayment());
		
		String result = bill.makePayment(5000, "SBI Card 6576 XXXX XXXX XX12");
				
		System.out.println(result);
		
		bill.setStrategy(new CashPayment());
		
		result = bill.makePayment(10000, "Cash");
		
		System.out.println(result);
	}

}
