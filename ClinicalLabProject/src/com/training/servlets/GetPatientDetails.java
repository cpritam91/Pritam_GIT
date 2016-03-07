package com.training.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.daos.PatientDAO;
import com.training.entities.Patient;

public class GetPatientDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public GetPatientDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer patientCode = Integer.parseInt(request.getParameter("patientCode"));
		PrintWriter out = response.getWriter();
		PatientDAO pdao = new PatientDAO();
		Patient p = pdao.find(patientCode);
		response.setContentType("application/json");
		if(p!=null) {
			
	        out.println("{\"patientName\": \""+p.getPatientName()+"\",");
	        out.println("\"age\": \""+p.getAge()+"\",");
	        out.println("\"handPhone\": \""+p.getHandPhone()+"\",");
	        out.println("\"email\": \""+p.getEmail()+"\",");
	        out.println("\"gender\": \""+p.getGender()+"\"}");
		}
		else {
			out.println("{\"patientName\": \"\",");
	        out.println("\"age\": \"\",");
	        out.println("\"handPhone\": \"\",");
	        out.println("\"email\": \"\",");
	        out.println("\"gender\": \"\"}");
		}
		pdao.closeConn();
		out.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
