package com.training.servlet;

import java.io.*;
import java.util.HashMap;

import javax.servlet.*;
import javax.servlet.http.*;

import com.training.domains.BookManager;
import com.training.entity.Book;

/**
 * Servlet implementation class BookServlet
 */
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public BookServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		BookManager mgr = new BookManager();		
		HashMap<Long, Book> bookList = mgr.getAllBooks();
		
		request.setAttribute("foundBooks", bookList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("ShowBooks.jsp");
		
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
