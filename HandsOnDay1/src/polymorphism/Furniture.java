package polymorphism;

public class Furniture extends Item {

	private String type;
	public Furniture() {
	}

	public Furniture(int serialNumber, String type, int rentPerDay) {
		super(serialNumber, rentPerDay);
		this.type = type;
	}

	@Override
	public float calculateRent(int noOfDays) {

		int totalRent = noOfDays * this.getRentPerDay();
		return totalRent;
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void printItem()
	{
		System.out.println(this.getSerialNumber() + ":" + this.getType() + ": Rs." + this.getRentPerDay());
	}
	
}
