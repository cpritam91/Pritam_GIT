package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

	@Value("Harry Potter")
	private String bookName;
	@Value("1200.0")
	private double price;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(String bookName, double price) {
		super();
		this.bookName = bookName;
		this.price = price;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", price=" + price + "]";
	}
	
}
