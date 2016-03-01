package com.training.listeners;

import java.sql.Connection;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.training.utils.SQLConnection;

public class MyContextListener implements ServletContextListener,ServletContextAttributeListener {

    public MyContextListener() {
        // TODO Auto-generated constructor stub
    }
    

    public void contextInitialized(ServletContextEvent event)  { 
         
    	System.out.println("Context - Initialized ===== ");
    	String url = event.getServletContext().getInitParameter("url");
    	String className = event.getServletContext().getInitParameter("className");
    	String userName = event.getServletContext().getInitParameter("userName");
    	String passWord = event.getServletContext().getInitParameter("passWord");
    	
    	SQLConnection obj=new SQLConnection(url,className,userName,passWord);
    	
    	Connection con = obj.getOracleConnection();
    	   
    	event.getServletContext().setAttribute("dbconn",con);
    }
	
    
    
    public void contextDestroyed(ServletContextEvent arg0)  { 

    	System.out.println("Context - Destroyed ===== ");
    }


	@Override
	public void attributeAdded(ServletContextAttributeEvent event) {

		System.out.println("Attribute Added" + event.getServletContext().getAttributeNames());
	}


	@Override
	public void attributeRemoved(ServletContextAttributeEvent event) {

		System.out.println("Attribute Removed" + event.getServletContext().getAttributeNames());
	}


	@Override
	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		// TODO Auto-generated method stub
		
	}
    
    

}
