package com.training;

public class Application {

	public static void main(String[] args) {

		Book book1 = new Book(101,"Harry Potter and the Sorcerer's Stone","J. K. Rowling", 1200);
		
		BookSerializer bser = new BookSerializer(); 
		
		bser.serialize(book1);
		
		Book debook = (Book)bser.deSerialize();

		System.out.println(debook.getBookNumber());
		System.out.println(debook.getBookName());
		System.out.println(debook.getAuthor());
		System.out.println(debook.getPrice());
	}

}
