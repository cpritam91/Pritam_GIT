package com.training.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.daos.TestDAO;
import com.training.entities.Test;

public class GetTestDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public GetTestDetails() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String testCode = (String)request.getParameter("testCode");
		PrintWriter out = response.getWriter();
		TestDAO tdao = new TestDAO();
		Test p = tdao.find(testCode);
		response.setContentType("application/json");
		if(p!=null) {
			
	        out.println("{\"testName\": \""+p.getTestName()+"\",");
	        out.println("\"amount\": \""+p.getAmount()+"\"}");
		}
		else {
			out.println("{\"testName\": \"\",");
	        out.println("\"amount\": \"\"}");
		}
		tdao.closeConn();
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
