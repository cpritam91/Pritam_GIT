package com.training.entity;

import org.springframework.stereotype.Component;

@Component("invoice")
public class Invoice {

	private int InvoiceNumber;
	private String customerName;
	private double amount;
	
	public Invoice() {
		// TODO Auto-generated constructor stub
	}

	public Invoice(int invoiceNumber, String customerName, double amount) {
		super();
		InvoiceNumber = invoiceNumber;
		this.customerName = customerName;
		this.amount = amount;
	}

	public int getInvoiceNumber() {
		return InvoiceNumber;
	}

	public void setInvoiceNumber(int invoiceNumber) {
		InvoiceNumber = invoiceNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Invoice [InvoiceNumber=" + InvoiceNumber + ", customerName=" + customerName + ", amount=" + amount
				+ "]";
	}
}
