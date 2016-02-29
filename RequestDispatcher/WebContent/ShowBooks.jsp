<%@ page import= "java.util.*,com.training.entity.*,com.training.domains.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Books</title>
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
	HashMap<Long,Book> bookList = (HashMap<Long,Book>)request.getAttribute("foundBooks"); %>
	<table>
	<% for (Long bookId: bookList.keySet()){
	
	    Book bk = bookList.get(bookId);  %>
	    <tr>
	    <td><% out.println(bk.getBookNumber());%> </td>
	    <td><% out.println(bk.getBookName());%> </td>
	    <td><% out.println(bk.getAuthor());%> </td>
	    <td><% out.println(bk.getPrice());%> </td>
	    </tr>
	    <%
	} 
%>
	</table>
</body>
</html>