package com.training.domain;

import java.util.*;

import org.apache.log4j.Logger;

public class Restaurant {

	Logger log = Logger.getRootLogger();
	
	private List<FoodItem> items;
	
	public Restaurant() {
		
		items = new ArrayList<FoodItem>();
		
		log.info("Item List Initialized");
	}
	
	public void init(FoodItem food) {
		
		items.add(food);
		log.info("Food Item Added");
	}
	
	public List<FoodItem> getItems(String type) {

		ArrayList<FoodItem> temp = new ArrayList<FoodItem>();
		
		boolean veg;
		if(type.equals("veg"))
			veg = true;
		else if(type.equals("non-veg"))
			veg = false;
		else
			return null;
		for(FoodItem it : items) {
			if(it.isVegetarian() == veg)
				temp.add(it);
		}
		
		return temp;
	}
	
	public List<FoodItem> getMenuCard() {
		
		return items;
	}
	
}
