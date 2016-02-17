package crea.pattern.factory;

/**
 * 
 * @author pchak5
 *
 *
 * SubClass - I - Product I
 */

public class HousingLoan extends LoanAccount {

	private int years;
	
	public HousingLoan(double interest) {
		super(interest);
		years = 5;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	@Override
	public String toString() {
		return "HousingLoan [years=" + years + ", getInterest()=" + getInterest() + "]";
	}
	
	
}
