<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/Styles.css" type = "text/css" rel = "stylesheet"/>
</head>
<body>
	<h1>Registered User Login</h1>
	<table>
		<tr>
			<td>Role</td>
			<td><select name="role">
					<option selected="selected">Administrator</option>
					<option>Manager</option>
					<option>Lab Technician</option>
					<option>Operator</option>
			</select></td>
		</tr>
			
		<tr>
			<td>Lab Code</td>
			<td>
				<input type="text" id="ajax" list="json-datalist" placeholder="e.g. LC500">
				<datalist id="json-datalist"></datalist>
			</td>
		</tr>
	</table>
</body>
<script type="text/javascript" src="data/lab.json"></script>
<script type="text/javascript" src="scripts/loginAjax.js"></script>
</html>