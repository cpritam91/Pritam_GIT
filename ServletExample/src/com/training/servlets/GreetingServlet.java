package com.training.servlets;

import java.io.*;
import java.util.logging.Logger;

import javax.servlet.*;
import javax.servlet.http.*;
import com.training.entity.*;
import com.training.utils.*;

public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public Logger log = Logger.getLogger(this.getClass().toString());
    
    public GreetingServlet() {
        super();
        log.info("== Constructor Called ==");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		log.info("Vendor - Request Object : "+request.getClass().toString());
		log.info("Vendor - Response Object : "+response.getClass().toString());
		
		PrintWriter out = response.getWriter();
		
		response.setContentType("text/html");
		
		String user = request.getParameter("userName");
		
		String pword = request.getParameter("passWord");
		
		String role = request.getParameter("role");
		
		out.println("<h1 style='text-align:center'>Welcome to Servlet Programming<h1>");
		
		User usr = new User(Integer.parseInt(user),pword,role);
		ValidateUser valid = new ValidateUser();
		boolean check = valid.checkUser(usr);
		if(check)
			out.println("Welcome : "+role+" : "+user+" : "+pword);
		else
			out.println("Invalid User");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
