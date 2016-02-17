package stru.pattern.decorator;

public class SocialNetworkBanking extends FeatureDecorator{ 

	private BankAccount account;
	
	public SocialNetworkBanking(BankAccount account) {
		super(account);
		this.account = account;
	}
	@Override
	public double balanceToMaintain() {
		return account.balanceToMaintain()+10000.0;
	}

	
}
