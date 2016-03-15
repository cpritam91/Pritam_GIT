<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<a href="showAll">View All Bookings</a>
	
	<hr>
	
	<form action="cust/check">
		Please Enter your name again
		<input type="text" name="name">
		<input type="submit" value="search">
	</form>
	Welcome ${command.name}
	<br>
	${prevBooking}
</body>
</html>