package polymorphism;

public abstract class Item {

	private int serialNumber;
	private int rentPerDay;
	public Item() {
		super();
	}
	public Item(int serialNumber,int rentPerDay)
	{
		super();
		this.serialNumber = serialNumber;
		this.rentPerDay = rentPerDay;
	}
	public abstract float calculateRent(int noOfDays);
	public abstract void printItem();
	
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public int getRentPerDay() {
		return rentPerDay;
	}
	public void setRentPerDay(int rentPerDay) {
		this.rentPerDay = rentPerDay;
	}
}
