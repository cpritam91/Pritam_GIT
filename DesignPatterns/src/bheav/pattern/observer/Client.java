package bheav.pattern.observer;

public class Client {

	public static void main(String[] args) {
		
		MealOrder order = new MealOrder();
		
		order.addObserver(new Waiter());
		
		order.setStatus("Accepted");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		order.setStatus("Completed");

	}

}
