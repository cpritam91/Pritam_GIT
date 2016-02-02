package polymorphism;

public class Fan extends Item {
	
	private String type;
	public Fan()
	{
		super();
	}
	public Fan(int SNo, String type, int rentPerDay)
	{
		super(SNo,rentPerDay);
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float calculateRent(int noOfDays) {
		
		int totalRent = noOfDays * this.getRentPerDay();
		return totalRent;
	}
	public void printItem()
	{
		System.out.println(this.getSerialNumber() + ":" + this.getType() + ": Rs." + this.getRentPerDay());
	}
}
