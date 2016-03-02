<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Exception Handler</title>
<style type="text/css">
	
</style>
</head>
<body>
<h1>Exception Handler</h1>

Exception Message <p style="color : red"><%=exception.getMessage() %></p>
Exception Class <p style="color : blue"><%=exception.getClass() %></p>

<p><a href="AddCustomer.jsp">Try Again</a></p>
</body>
</html>