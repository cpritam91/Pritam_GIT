package com.training.domains;

import com.training.ifaces.Automobile;

public class ShowRoom {
	
	public Automobile getItem(int key)
	{
		switch(key)
		{
		case 1:
			return new PassengerCar();
		case 2:
			return new LuxuryCar();
		case 3:
			return new Sportscar();
		default:
			return null;
		}
	}
	
	public void printQuote(Automobile polyAuto)
	{
		/**
		 * Print the quotation
		 */
		System.out.println("======== Quotation ========");
		System.out.println(" Model := "+polyAuto.getModel());
		System.out.println(" Color := "+polyAuto.getColor());
		System.out.println(" Price := "+polyAuto.getPrice());
	}
}
