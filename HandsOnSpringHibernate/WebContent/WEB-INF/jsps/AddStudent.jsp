<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Student</title>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
</head>
<body>

	<form:form method="POST" action="AddStudent.htm">
		<label>Roll Number</label>
		<form:input path="rollNo"/><br>
		<label>Student Name</label>
		<form:input path="name"/><br>
		<label>Academic Marks</label>
		<form:input path="marks_Academic"/><br>
		<label>Event Marks</label>
		<form:input path="marks_Event"/><br>
		<label>Sports Marks</label>
		<form:input path="marks_Sport"/><br>
		<label>Cultural Marks</label>
		<form:input path="marks_Cultural"/><br>
		<label>Photo_Path</label>
		<form:input  path="photopath"/><br>
		<form:select path="deptId" items="${deptList}"></form:select>
		<input type ="submit" value="OK">
	</form:form>

</body>
</html>