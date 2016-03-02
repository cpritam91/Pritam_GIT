package com.training.tags;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class ForEachTag extends TagSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<String> list;
	private String attrName;
	
	
	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	@Override
	public int doStartTag() throws JspException {
		
		try {
			JspWriter out = pageContext.getOut();

			list= (ArrayList<String>)pageContext.findAttribute(attrName);
				if(list==null)
					out.println("Empty List");
				else {
				for(String obj : list) {
					out.println(obj);
				}}
						
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return Tag.SKIP_BODY; //Tag interface having a constant SKIP_BODY
	} 
}
