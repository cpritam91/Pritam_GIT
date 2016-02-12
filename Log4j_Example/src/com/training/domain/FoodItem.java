package com.training.domain;

import org.apache.log4j.Logger;

public class FoodItem {
	Logger log = Logger.getLogger(this.getClass().getName());
	private int itemCode;
	private String itemName;
	private double ratePerUnit;
	private boolean isVegetarian;
	
	
	
	public FoodItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public FoodItem(int itemCode, String itemName, double ratePerUnit, boolean isVegetarian) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.ratePerUnit = ratePerUnit;
		this.isVegetarian = isVegetarian;
		//log.setLevel(Level.);
		log.info("Food Item Initialized");
	}


	public int getItemCode() {
		return itemCode;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getRatePerUnit() {
		return ratePerUnit;
	}
	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	public boolean isVegetarian() {
		return isVegetarian;
	}
	public void setVegetarian(boolean isVegetarian) {
		this.isVegetarian = isVegetarian;
	}


	@Override
	public String toString() {
		return "FoodItem [itemCode=" + itemCode + ", itemName=" + itemName + ", ratePerUnit=" + ratePerUnit
				+ ", isVegetarian=" + isVegetarian + "]";
	}
	
	
	
}
