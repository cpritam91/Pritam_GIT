<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Customer</title>
</head>
<body>
	<header>
		<%@ include file="Header.jsp"  %>
	</header>
	<section>
		<form action="ProcessCustomer.jsp">
			<label>Customer Id</label><input type="text" name="customerId">
			<label>Customer Name</label><input type="text" name="customerName">
			<label>Email</label><input type="email" name="email">
			<label>Hand Phone</label><input type="tel" name="handPhone" pattern="[1-9]{1}[0-9]{9}" placeholder="9999999999">
			<input type="submit" value="Add">
		</form>
	</section>
	<footer>
		<jsp:include page="Footer.jsp"/>
	</footer>
</body>
</html>