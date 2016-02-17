package crea.pattern.factory;


/**
 * 
 * @author pchak5
 *
 *
 * Factory Class with a static method to create a instance of subclass
 */

public class LoanFactory {

	public static LoanAccount createInstance(Loan type) {
		
		switch(type) {
			
			case HOUSINGLOAN:
				return new HousingLoan(10);
			case PERSONALLOAN:
				return new PersonalLoan(5, "Pritam");
			default:
				return null;
		
		}
		
	}
	
}
