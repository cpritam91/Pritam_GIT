package stru.pattern.proxy;

public class CalculateBeanImpl implements CalculateBean{

	@Override
	public void printHello() {
		System.out.println("This is a proxy example");
	}

}
