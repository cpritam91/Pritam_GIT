package com.myexceptions;

public class RangeCheckException extends Exception {
/*No need for a 0 argument constructor. Only one way to create an instance of the class*/
	//Checked exception - because extending Exception
	private long handPhone;
	//Mandatory Dependency
	public RangeCheckException(long handPhone) {
		
		super();
		this.handPhone = handPhone;
		
	}
	//Overriding Super Class Method
	@Override
	public String getMessage() {
		return  handPhone + "Should Be a 10 Digit Number";
	}
	
	
	
}
