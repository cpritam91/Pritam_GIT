package stru.pattern.proxy;

public class CalculateBeanProxy implements CalculateBean{

	CalculateBean obj;
	
	@Override
	public void printHello() {
		obj = new CalculateBeanImpl();
		obj.printHello();
	}

}
