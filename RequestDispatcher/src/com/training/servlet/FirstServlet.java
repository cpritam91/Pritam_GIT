package com.training.servlet;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		HttpSession session = request.getSession(true);
		out.println("Welcome " + session.getAttribute("userName"));
		out.println("<br>---- " + request.getAttribute("location")+"<br>");
		out.println("<br>---- " + getServletContext().getAttribute("phone")+"<br>");
		out.println("Session Id :="+session.getId());
		out.println("New Session :="+session.isNew());
		out.println("<a href='Second.jsp'>Continue</a>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
