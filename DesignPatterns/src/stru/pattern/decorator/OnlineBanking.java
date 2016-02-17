package stru.pattern.decorator;

public class OnlineBanking extends FeatureDecorator {

	BankAccount account;
	public OnlineBanking(BankAccount account) {
		super(account);
		this.account = account;
	}
	
	@Override
	public double balanceToMaintain() {
		return account.balanceToMaintain()+5000.0;
	}
	
}
