package stru.pattern.decorator;
/**
 * 
 * @author pchak5
 *
 *CONCRETE COMPONENT
 *
 */

public class SavingsAccount extends BankAccount {

	@Override
	public double balanceToMaintain() {
		
		return 1000.0;
	}
	
}
