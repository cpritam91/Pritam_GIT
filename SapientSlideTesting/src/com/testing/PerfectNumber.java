package com.testing;

public class PerfectNumber {
	
	public PerfectNumber() {
		super();
	}

	public static Boolean isPerfect(int num) {
		
		
		int sumOfDiv = 0;
		
		for(int i=1 ; i<= num/2; i++) {
			
			if( num % i == 0)
				sumOfDiv += i;
		}
		if(sumOfDiv == num && num > 1)
			return true;
		else
			return false;
	}
	
	
}
