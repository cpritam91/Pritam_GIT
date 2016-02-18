package bheav.pattern.strategy;

public class CashPayment implements PaymentStrategy {

	@Override
	public String pay(double amt, String description) {
		
		String msg = "Your Payment Request of INR. " +amt + " By " + description +" received.\n";
		
		StringBuffer buffer = new StringBuffer(msg);
		
		double discount = amt * 0.05;
		
		double total = amt - discount;
		
		buffer.append("Discount of Rs. " + discount + " is given.\n");
		
		buffer.append("Net Amount Rs. "+total+ "\n");
		
		return buffer.toString();
	}

}
