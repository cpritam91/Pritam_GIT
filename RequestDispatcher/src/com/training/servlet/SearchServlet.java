package com.training.servlet;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.domains.BookManager;
import com.training.entity.Book;

public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public SearchServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BookManager mgr = new BookManager();
		//PrintWriter out = response.getWriter();
		
		response.setContentType("text/html");
		Long bookId = Long.parseLong(request.getParameter("search"));
		Book b = mgr.findBookById(bookId);
		
		request.setAttribute("foundBook", b);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("SearchResult.jsp");
		
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
