package stru.pattern.decorator;

public class Client {

	public static void main(String[] args) {

		OnlineBanking acc = new OnlineBanking(new SavingsAccount()); //Bank Account + Online Banking
		System.out.println(acc.balanceToMaintain());
		
		SocialNetworkBanking acc1 = new SocialNetworkBanking(new OnlineBanking(new SavingsAccount()));	//Bank Account + Online Banking + SocialNetworkBanking
	//  SocialNetworkBanking acc1 = new SocialNetworkBanking(acc);
		System.out.println(acc1.balanceToMaintain());
	}

}
