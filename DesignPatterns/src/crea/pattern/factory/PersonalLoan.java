package crea.pattern.factory;

/**
 * 
 * @author pchak5
 *
 *
 * SubClass  II / Product II
 */

public class PersonalLoan extends LoanAccount {

	private String name;
	
	public PersonalLoan(double interest,String name) {
		super(interest);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PersonalLoan [name=" + name + ", getInterest()=" + getInterest() + "]";
	}
	
	
}
