<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<title>Select Department</title>
</head>
<body>
	<h1>Select the department</h1>
	<form action="ListTop3.htm" method="POST">
	<select name="deptId"> 
	<c:forEach var="dept" items="${deptList}">
		<option value="${dept.key}">${dept.value}</option>
	</c:forEach>
	</select>
	<input type="submit" value="OK">
	</form>
</html>