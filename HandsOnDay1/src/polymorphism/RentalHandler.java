package polymorphism;

public class RentalHandler {
	
	static Item list[] = new Item[20];
	static int size = 0;
	public static void addItem(Item it)
	{
		if(size == 10) {
			System.out.println( " Array Full!!! ");
			return;
		}
		list[size]=it;
		size++;
	}

	public static void printItemArray()
	{
		for(int i = 0 ; i < size ; i++){
			System.out.print((i+1) + ".");
			list[i].printItem();
		}
	}
	
	public static float displayRent(int ino, int nod)
	{
		float totalRent = list[ino - 1].calculateRent(nod);
		System.out.println("Total Rent for this item is : Rs." + totalRent);
		return totalRent;
	}
}
