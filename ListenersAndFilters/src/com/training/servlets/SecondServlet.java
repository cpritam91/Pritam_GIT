package com.training.servlets;

import java.io.IOException;
//import java.io.PrintWriter;
import java.sql.Connection;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.entity.User;
import com.training.utils.ValidateUser;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		Integer uId = Integer.parseInt(request.getParameter("empId"));
		String pass = request.getParameter("password");
		String role = request.getParameter("role");
		
		User u = new User(uId,pass,role);
		
		Connection con = (Connection)request.getServletContext().getAttribute("dbconn");
		
		ValidateUser check = new ValidateUser(con);
		boolean valid = check.checkUser(u);
		
		request.getServletContext().setAttribute("role", role);
		request.getServletContext().setAttribute("valid", valid);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
