package com.training.domains;

import java.util.*;

public class Invoice {

	private int invoiceId;
	private List<Item> products;
	private Map<String,Double> tax;
	private double price;
	private Customer cust;
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Invoice(int invoiceId, List<Item> products, double price, Customer cust) {
		super();
		this.invoiceId = invoiceId;
		this.products = products;
		this.price = price;
		this.cust = cust;
	}
	public List<Item> getProducts() {
		return products;
	}
	public void setProducts(List<Item> products) {
		this.products = products;
	}
	public int getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	
	public Map<String, Double> getTax() {
		return tax;
	}
	public void setTax(Map<String, Double> tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "Invoice [invoiceId=" + invoiceId + ", products=" + products + ", price=" + price + ", cust=" + cust
				+ "]";
	}
}
