package stru.pattern.composite;


public class Store implements Profitable {

	private double profit;
	private String storeName;
		
	public Store(double profit, String storeName) {
		super();
		this.profit = profit;
		this.setStoreName(storeName);
	}

	@Override
	public double getProfit() {
		return this.profit;
	}

	@Override
	public void addLeaf(Profitable child) {
		
	}

	@Override
	public void removeLeaf(Profitable child) {
		
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

}
