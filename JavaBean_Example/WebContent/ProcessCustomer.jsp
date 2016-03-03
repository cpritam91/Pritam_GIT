<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="ExceptionHandler.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Using Java Bean</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>
<jsp:useBean id="custBean" class="com.training.beans.Customer" scope="session"/>
<jsp:setProperty property="*" name="custBean"/>
Dear : <jsp:getProperty property="customerName" name="custBean"/> Thank You for registering.

Invoking Bean Method <c:out value="${custBean.getInfo()}"/>
</body>
</html>