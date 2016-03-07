package com.training.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.daos.UserDAO;
import com.training.entities.User;

/**
 * Servlet implementation class Authentication
 */
public class Authentication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Authentication() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String user = request.getParameter("userName");
		
		String pword = request.getParameter("passWord");
		
		String role = request.getParameter("role");
		
		String labCode = request.getParameter("labCode");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("PatientDetails.jsp");
		UserDAO udao = new UserDAO();
		boolean flag = false;
		User u1 = udao.find(user);
		if(u1 != null) {
			if(pword.equals(u1.getPassWord()) && role.equals(u1.getRole()) && labCode.equals(u1.getLabCode())) {
				dispatcher.forward(request, response);
				flag=true;
			}
		}
		if(!flag)
			out.println("Invalid User");
		out.println(pword + "  "+user+"   "+role+"   "+labCode + "<br>");
		out.println(u1.getPassWord() + "  "+u1.getUserName()+"   "+u1.getRole()+"   "+u1.getLabCode() + "<br>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
