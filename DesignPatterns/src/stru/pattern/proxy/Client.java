package stru.pattern.proxy;

public class Client {

	public static void print(CalculateBean obj) {
		
		obj.printHello();
	}
	
	public static void main(String[] args) {

		CalculateBeanProxy obj = new CalculateBeanProxy();
		print(obj);
	}

}
