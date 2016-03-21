<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<title>Add Department</title>
</head>
<body>
	<form:form method="POST" action="AddDepartment.htm">
		<label>Department Id</label>
		<form:input path="deptId"/><br>
		<label>Department Name</label>
		<form:input path="deptName"/><br>
		<input type ="submit" value="OK">
	</form:form>
</body>
</html>