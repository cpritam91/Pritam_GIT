<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First</title>
</head>
<body>
<%request.setAttribute("location", "Kolkata"); %>
<%application.setAttribute("phone", "7800484041"); %>
<% session.setAttribute("userName", "Pritam"); %>
<div style = "text-align : right;">
	Welcome : <%=session.getAttribute("userName") %>
	----<%=request.getAttribute("location")%>----
	----<%=application.getAttribute("phone")%>----
</div>
 New Session --> <span style= "color : red"><%=session.isNew()%></span>
 Session ID --> <span style= "color : blue"><%=session.getId()%></span>
 
 <a href="FirstServlet">Continue</a>
</body>
</html>