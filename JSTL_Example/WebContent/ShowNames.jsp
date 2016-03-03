<%@ page import="java.util.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix= "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
</head>
<body>
<table>
	<c:forEach items = "${requestScope.studentList}" var = 'stud'>
		<tr>
			<c:if test="${stud.contains('esh')}"> <!-- Using jstl/core -->
				<td style="color: red"><c:out value="${stud}"/></td>
			</c:if>
			<c:if test="${!fn:contains(stud, 'esh')}"> <!-- Using jstl/functions -->
				<td><b><c:out value="${stud}"/></b></td>
			</c:if>
		</tr>
	</c:forEach>
</table>
</body>
</html>