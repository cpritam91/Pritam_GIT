package com.training.domains;

import com.training.ifaces.Automobile;

public class NewShowRoom extends ShowRoom {

	public Automobile getItem(int key)
	{
		if (key>=1 && key <=3)
			return super.getItem(key);
			
		else
			return new SportsBike();
	}
}
