<%@ page import="java.util.*,com.training.entity.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Customers</title>
<style>
	table,td,tr {
		font-family:arial;
		border-style:solid;
		border-width: 3px;
		border-collapse: collapse;
	}
</style>
</head>
<body>
	<table>
	<% List<Customer> cusList = (List<Customer>)request.getAttribute("customerList");
		for(Customer cus : cusList) { %>
		<tr>
			<td><% out.println(cus.getCustomerId());%></td>
			<td><% out.println(cus.getCustomerName());%></td>
			<td><% out.println(cus.getEmail_Id());%></td>
			<td><% out.println(cus.getHandPhone());%></td>
		</tr>
	<% 	}
	%>
	</table>
</body>
</html>