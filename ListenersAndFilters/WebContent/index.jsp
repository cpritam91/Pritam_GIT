<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listener Example</title>
</head>
<body>
<form action="SecondServlet">
	Employee Id <input type="text" name="empId" size="20"><br/>
	Password <input type="password" name="password" size="20"><br/>
	Role <select name="role">
		<option>Admin</option>
		<option>Chef</option>
		<option>Waiter</option>
	</select><br/>
	<input type="submit" value="Login"> 
</form>
	
	
</body>
</html>