<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<title>Final List</title>
</head>
<body>
	Best 3 students <br>
	<c:forEach var="stuName" items="${finalList}">
		<label>${stuName.name}</label>
		<label> <img src="${stuName.photopath}" height="200px" width="140px"/></label><br>
	</c:forEach>
</body>
</html>