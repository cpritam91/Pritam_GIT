package bheav.pattern.strategy;

public interface PaymentStrategy {

	public String pay(double amt, String description);
}
