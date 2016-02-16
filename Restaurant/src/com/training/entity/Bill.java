package com.training.entity;

import java.sql.Timestamp;

public class Bill {
	
	private int billNo;
	private int tableNo;
	private String customerName;
	private int noOfCustomers;
	private Timestamp time;
	private double amount;
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bill(int billNo, int tableNo, String customerName, int noOfCustomers, Timestamp time, double amount) {
		super();
		this.billNo = billNo;
		this.tableNo = tableNo;
		this.customerName = customerName;
		this.noOfCustomers = noOfCustomers;
		this.time = time;
		this.amount = amount;
	}
	
	public Bill(int billNo, int tableNo, String customerName, int noOfCustomers, double amount) {
		super();
		this.billNo = billNo;
		this.tableNo = tableNo;
		this.customerName = customerName;
		this.noOfCustomers = noOfCustomers;
		this.amount = amount;
	}
	public int getBillNo() {
		return billNo;
	}
	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}
	public int getTableNo() {
		return tableNo;
	}
	public void setTableNo(int tableNo) {
		this.tableNo = tableNo;
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
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Bill [billNo=" + billNo + ", tableNo=" + tableNo + ", customerName=" + customerName + ", noOfCustomers="
				+ noOfCustomers + ", time=" + time + ", amount=" + amount + "]";
	}
}
