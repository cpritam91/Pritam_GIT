<%@ page import="com.training.entity.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Result</title>
<style>
	table,tr,td {
		border-style: solid;
		border-collapse: collapse;
		margin-left: auto;
		margin-right: auto;
	}
</style>
</head>
<body>
<% 
	Book bk = (Book)request.getAttribute("foundBook");
	if(bk==null)
		out.println("Book Not Found");
	else
	{
%>
	<table>
		<tr>
			<td><% out.println(bk.getBookNumber());%> </td>
	    	<td><% out.println(bk.getBookName());%> </td>
	   		<td><% out.println(bk.getAuthor());%> </td>
	    	<td><% out.println(bk.getPrice());%> </td>
		</tr>
	</table>
	<%} %>
</body>
</html>