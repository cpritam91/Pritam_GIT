<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<title>Welcome</title>
</head>
<body>
	<c:url value="Login.jsp" var="login"/>
	<a href='<c:out value="${login}"/>'>Welcome</a>
</body>
</html>