<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Clinical Lab</title>
<link href="css/Styles.css" type = "text/css" rel = "stylesheet"/>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
</head>
<body>
	<div id="flag">
	<a href="login.jsp?lang=en"><img src="images/en.jpg" width="30px" height="20px"></a> &nbsp;
	<a href="login.jsp?lang=fr"><img src="images/fr.gif" width="30px" height="20px"></a>
	</div>
	<br/><br/>
    <c:import url="Header.jsp"/>
    <nav>
	<ul>
		<li><a href="login.jsp?lang=${param.lang}"><span style = "padding-left : 5px">Patient</span></a></li>
		<li><a href="login.jsp?lang=${param.lang}"><span style = "padding-left : 5px">Doctor</span></a></li>
		<li><a href="login.jsp?lang=${param.lang}"><span style = "padding-left : 5px">Lab Tests</span></a></li>
		<li><a href="login.jsp?lang=${param.lang}"><span style = "padding-left : 5px">Help</span></a></li>
	</ul>
</nav>
	<fmt:setLocale value="${param.lang}"/>
	<fmt:setBundle basename="MessageResources" var="msg"/>
	<h1>Registered User Login</h1>
	<form action="Authentication">
	<table>
		<tr>
			<td><label><fmt:message key="forms.label.role" bundle="${msg}"/></label></td>
			<td><select name="role">
					<option selected="selected">Administrator</option>
					<option>Manager</option>
					<option>Lab Technician</option>
					<option>Operator</option>
			</select></td>
		</tr>
			
		<tr>
			<td><label><fmt:message key="forms.label.labCode" bundle="${msg}"/></label></td>
			<td>
				<datalist id="json-datalist"></datalist>
				<input name="labCode" type="text" id="ajax" list="json-datalist" placeholder="e.g. LC500">
				
			</td>
		</tr>
			
		<tr>
			<td><label><fmt:message key="forms.label.userName" bundle="${msg}"/></label></td>
			<td><input type="text" name="userName"></td>
		</tr>
		<tr>
			<td><label><fmt:message key="forms.label.passWord" bundle="${msg}"/></label></td>
			<td><input type="password" name="passWord"></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="reset" value="Reset">
				<input type="submit" value="Submit">
			</td>
		</tr>
	</table>
	</form>
	<hr>
	<c:import url="Footer.jsp"/>
</body>
<script type="text/javascript" src="scripts/loginAjax.js"></script>
</html>