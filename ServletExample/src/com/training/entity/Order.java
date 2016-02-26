package com.training.entity;

public class Order {

	private int billNo;
	private int orderId;
	private int itemId;
	private int quantity;
	private boolean isReady;
		
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int orderId, int billNo, int itemId, int quantity, boolean isReady) {
		super();
		this.billNo = billNo;
		this.orderId = orderId;
		this.itemId = itemId;
		this.quantity = quantity;
		this.isReady = isReady;
	}
	
	
	public boolean isReady() {
		return isReady;
	}

	public void setReady(boolean isReady) {
		this.isReady = isReady;
	}

	public int getBillNo() {
		return billNo;
	}

	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(Item item) {
		this.itemId = item.getItemId();
	}

	@Override
	public String toString() {
		return "Order [billNo=" + billNo + ", orderId=" + orderId + ", itemId=" + itemId + ", quantity=" + quantity
				+ ", isReady=" + isReady + "]";
	}
	
	
	
}