<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Book</title>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
</head>
<body>

	<form:form method="POST" action="bookEntry.htm">
		<label>Book Id</label>
		<form:input path="bookId"/>
		<label>Book Name</label>
		<form:input path="bookName"/>
		<label>Subject</label>
		<form:select path="subject" items="${subjectCode}"></form:select>
		<label> International Code</label>
		<form:input path="code.interCode"/>
		<input type ="submit" value="OK">
	</form:form>

</body>
</html>