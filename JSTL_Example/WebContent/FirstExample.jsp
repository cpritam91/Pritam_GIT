<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My First Scriptless JSP</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix= "c"%>
</head>
<body>
	<c:set var="name" value="Welcome to JSTL Programming" scope="page"/>
	
	<span style="color : red"><c:out value="${name}"></c:out></span>
	
	<c:url value="NameServlet" var="link"/>
	<a href='<c:out value="${link}"/>'>Print Names</a>
</body>
</html>