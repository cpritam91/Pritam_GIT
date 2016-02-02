package com.training.domains;

import com.training.ifaces.Automobile;

public class LuxuryCar implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Steel";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 8000000.00;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Mercedes C Class";
	}

}
