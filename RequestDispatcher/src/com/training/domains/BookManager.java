package com.training.domains;
import java.util.*;
import com.training.entity.Book;

public class BookManager {

	private HashMap<Long,Book> bookList;
	
	public BookManager() {
		
		bookList = new HashMap<Long,Book>();
		bookList.put(101L, new Book(101,"Sherlock","Sir Arthur Conan Doyle",750.0));
		bookList.put(102L, new Book(102,"Harry Potter","J.K. Rowling",1250.0));
		bookList.put(103L, new Book(103,"Head First Java","Kathy Sierra",600.0));
		bookList.put(104L, new Book(104,"Complete Reference Java","Herbert Schildt",535.0));
	}
		
	public HashMap<Long, Book> getAllBooks() { 
		return bookList;
	}
	
	public Book findBookById(long id) {
		Book b = bookList.get(id);
		return b;
	}
}
