package com;

public class TestCurrencyConverter {

	public static void main(String[] args) {
		
		CurrencyConverter obj = new CurrencyConverter();
		System.out.println("$1.0 = Rs. " + obj.dollarToINR(1));
		
	}

}
