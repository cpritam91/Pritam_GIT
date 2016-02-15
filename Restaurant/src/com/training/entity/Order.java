package com.training.entity;

import java.util.ArrayList;

public class Order {

	private int OrderId;
	private int WaiterId;
	private int TableNo;
	private String customerName;
	private int noOfCustomers;
	private ArrayList<Item> itemsOrdered;
	
		
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int orderId, int waiterId, int tableNo, String customerName, int noOfCustomers,
			ArrayList<Item> itemsOrdered) {
		super();
		OrderId = orderId;
		WaiterId = waiterId;
		TableNo = tableNo;
		this.customerName = customerName;
		this.noOfCustomers = noOfCustomers;
		this.itemsOrdered = itemsOrdered;
	}

	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int orderId) {
		OrderId = orderId;
	}

	public int getWaiterId() {
		return WaiterId;
	}

	public void setWaiterId(int waiterId) {
		WaiterId = waiterId;
	}

	public int getTableNo() {
		return TableNo;
	}

	public void setTableNo(int tableNo) {
		TableNo = tableNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getNoOfCustomers() {
		return noOfCustomers;
	}

	public void setNoOfCustomers(int noOfCustomers) {
		this.noOfCustomers = noOfCustomers;
	}

	public ArrayList<Item> getItemsOrdered() {
		return itemsOrdered;
	}

	public void setItemsOrdered(ArrayList<Item> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}
	
	public void addItem(Item it) {
		itemsOrdered.add(it);
	}
}
