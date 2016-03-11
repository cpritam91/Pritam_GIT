package com.training.entity;

import java.util.logging.Logger;

import org.springframework.stereotype.Component;

@Component("book")
public class Book {

	Logger log = Logger.getLogger(this.getClass().getName());
	private int bookId;
	private String bookName;
	private String subject;
	private Isbn code;
	
	public Book() {

		log.info("Book Initialized");
	}
	public Book(int bookId, String bookName, String subject) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.subject = subject;
	}
	public int getBookId() {
		log.info("Getter for BookId");
		return bookId;
	}
	public void setBookId(int bookId) {
		log.info("Setter for BookId");
		this.bookId = bookId;
	}
	public String getBookName() {
		log.info("Getter for BookName");
		return bookName;
	}
	public void setBookName(String bookName) {
		log.info("Setter for BookName");
		this.bookName = bookName;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	public Isbn getCode() {
		return code;
	}
	public void setCode(Isbn code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Book [log=" + log + ", bookId=" + bookId + ", bookName=" + bookName + ", subject=" + subject + ", code="
				+ code + "]";
	}
}
