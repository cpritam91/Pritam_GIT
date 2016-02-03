package com.training;

import java.io.*;

public class Application2 {

	public static void main(String[] args) {

		Book book1 = new Book(101,"Harry Potter and the Sorcerer's Stone","J. K. Rowling", 1200);
		Book book2 = new Book(102,"Head First Java","Kathy Sierra", 600);
		Book book3 = new Book(103,"Thinking in C++","Bruce Ekkel", 700);
		Book book4 = new Book(104,"Operating System Concepts","William Stallings", 500);

		Book list[] = {book1,book2,book3,book4};
				
		BookManager bm = new BookManager();
		
		File file = bm.addBooks(list,new File("Books.dat"));
		
		bm.printBooks(file);
	}

}
