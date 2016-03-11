package com.training.entity;

public class Isbn {

	private String interCode;
	private String bookCode;
	private String category;
	
	public Isbn() {
		// TODO Auto-generated constructor stub
	}

	public Isbn(String interCode, String bookCode, String category) {
		super();
		this.interCode = interCode;
		this.bookCode = bookCode;
		this.category = category;
	}

	public String getInterCode() {
		return interCode;
	}

	public void setInterCode(String interCode) {
		this.interCode = interCode;
	}

	public String getBookCode() {
		return bookCode;
	}

	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Isbn [interCode=" + interCode + ", bookCode=" + bookCode + ", category=" + category + "]";
	}
	
}
