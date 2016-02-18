package stru.pattern.composite;

public class Client {

	public static void main(String[] args) {
		
		Store s1 = new Store(5000,"A");
		Store s2 = new Store(10000,"B");
		Store s3 = new Store(15000,"C");

		City delhi = new City("Delhi");
		
		delhi.addLeaf(s1);
		delhi.addLeaf(s2);
		delhi.addLeaf(s3);
		
		System.out.println("Total Collection in Delhi : Rs. " + delhi.getProfit());
		
		City gurgaon = new City("gurgaon");
		
		gurgaon.addLeaf(s1);
		gurgaon.addLeaf(s2);
		gurgaon.addLeaf(s3);
		
		System.out.println("Total Collection in Gurgaon : Rs. " + gurgaon.getProfit());
		
		State delhiNCR = new State("Delhi NCR");
		
		delhiNCR.addLeaf(gurgaon);
		delhiNCR.addLeaf(delhi);
		
		System.out.println("Total Collection in Delhi NCR : Rs. " + delhiNCR.getProfit());
		
	}

}
