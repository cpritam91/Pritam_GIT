<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
</head>
<body>
	<jsp:useBean id="currentDate" class="java.util.Date" scope="application"/>
	
	<fmt:setLocale value="en"/>
	<fmt:setBundle basename="MessageResources" var="msg"/>
	<form action="">
		<label><fmt:message key="forms.label.userName" bundle="${msg}"/></label>
			<input type="text" name="userName">
		<label><fmt:message key="forms.label.passWord" bundle="${msg}"/></label>
			<input type="password" name="passWord">
		<br/>
		Indian Time
			<fmt:formatDate value="${currentDate}" type="both"/>
		<br/>
		American Pacific Time
		<fmt:timeZone value="America/Los_Angeles">
			<fmt:formatDate value="${currentDate}" type="both"/>
		</fmt:timeZone>
		<br/>
		Eastern Standard Time
		<fmt:timeZone value="America/New_York">
			<fmt:formatDate value="${currentDate}" type="both"/>
		</fmt:timeZone>
	</form>
</body>
</html>