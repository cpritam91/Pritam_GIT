package com.training.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;


/**
 * Servlet Filter implementation class Authentication
 */
public class AuthenticationFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AuthenticationFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
	
		chain.doFilter(request, response);
		
		HttpServletRequest req=(HttpServletRequest)request;
		
		String role = (String)req.getServletContext().getAttribute("role");

		Boolean valid = (Boolean)req.getServletContext().getAttribute("valid");
		
		System.out.println(role);

		System.out.println(valid);
		RequestDispatcher dispatcher;
		
		if(valid) {
			
			if(role.equals("Admin"))
				dispatcher = request.getRequestDispatcher("Admin.jsp");
			else 
				dispatcher = request.getRequestDispatcher("Employee.jsp");
		}
		else 
			dispatcher = request.getRequestDispatcher("Invalid.jsp");
			
		dispatcher.forward(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
