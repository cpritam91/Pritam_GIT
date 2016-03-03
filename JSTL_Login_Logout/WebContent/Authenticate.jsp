<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Authenticate</title>
<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>
	<c:set var="loginUser" scope="session" value="${param.userName}"/>
	<%@ include file="Header.jsp"%>
	<h1>Welcome <c:out value="${loginUser}"/></h1>
	<a href="Next.jsp">Go to next page</a>
</body>
</html>