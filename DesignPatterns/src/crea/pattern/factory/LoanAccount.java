package crea.pattern.factory;

/**
 * 
 * @author pchak5
 *
 * Super Type - Super Class
 *
 */



public abstract class LoanAccount {

	private double interest;
	
	protected LoanAccount(double interest) {
		this.interest = interest;
	}
	
	public double getInterest() {
		return interest;
	}
}
