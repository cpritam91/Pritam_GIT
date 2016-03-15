package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {

	@Value("Pritam")
	private String customerName;
	@Autowired
	private Book book;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerName, Book book) {
		super();
		this.customerName = customerName;
		this.book = book;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", book=" + book + "]";
	}
	
}
