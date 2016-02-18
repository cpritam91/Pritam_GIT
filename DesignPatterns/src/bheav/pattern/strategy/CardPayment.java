package bheav.pattern.strategy;

public class CardPayment implements PaymentStrategy{

	@Override
	public String pay(double amt, String description) {
		String msg = "Your Payment Request of INR. " +amt + " By " + description +" received.\n";
		StringBuffer buffer = new StringBuffer(msg);
		
		double processFee = amt * 0.012;
		
		double total = processFee + amt;
		
		buffer.append("Processing fee of Rs. " + processFee + " is Chargeable\n");
		
		buffer.append("Net Amount Rs. "+total + "\n");
		
		return buffer.toString();
	}	
}
