package crea.pattern.singleton;

public class Client {

	public static void main(String[] args) {
		
		Counter count1 = Counter.getInstance();
		System.out.println(count1.hashCode());
		
		Counter count2 = Counter.getInstance();
		System.out.println(count2.hashCode());
		
		Counter count3 = Counter.getInstance();
		System.out.println(count3.hashCode());
		
	}
	
}
