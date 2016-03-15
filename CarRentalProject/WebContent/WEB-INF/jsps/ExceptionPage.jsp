<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error Handler</title>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>
	Exception URL : ${url} <br>
	Cause : ${msg}<br>
	StackTrace : 
	<ul>
		<c:forEach items="${exception.stackTrace}" var="item">
			<li> <c:out value="${item}"/> </li>
		</c:forEach>
	</ul>
</body>
</html>