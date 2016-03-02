package com.training.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class GreetingTag extends TagSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private	String userName;
	
	
	
	public GreetingTag() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public void setUserName(String userName) {
		this.userName = userName;
	}



	@Override
	public int doStartTag() throws JspException {
	
		try {
			JspWriter out = pageContext.getOut();
			if(userName != null)
				out.println("<b> Hello " + userName+"</b>");
			else
				out.println("<b>Welcome to JSP Programming</b>");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return Tag.SKIP_BODY; //Tag interface having a constant SKIP_BODY
	}
	
	
	
}
