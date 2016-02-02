package polymorphism;

public class AirConditioner extends Item {

	private double weight;
	
	public AirConditioner() {
	}

	public AirConditioner(int serialNumber, double weight, int rentPerDay) {
		super(serialNumber, rentPerDay);
		this.weight = weight;
	}

	@Override
	public float calculateRent(int noOfDays) {

		int totalRent = noOfDays * this.getRentPerDay();
		return totalRent;
		
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public void printItem()
	{
		System.out.println(this.getSerialNumber() + ":" + this.getWeight() + ": Rs." + this.getRentPerDay());
	}
}
