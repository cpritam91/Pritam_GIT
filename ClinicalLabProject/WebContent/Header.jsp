<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="flag">
	<a href="login.jsp?lang=en"><img src="images/en.jpg" width="30px" height="20px"></a> &nbsp;
	<a href="login.jsp?lang=fr"><img src="images/fr.gif" width="30px" height="20px"></a>
	</div>
	<br/><br/>
	<div id="labName"><h1> Apollo Clinical Labs</h1></div><br/>
	<hr>
	<nav>
	<ul>
		<li><a href="login.jsp?lang=${param.lang}"><span style = "padding-left : 5px">Patient</span></a></li>
		<li><a href="login.jsp?lang=${param.lang}"><span style = "padding-left : 5px">Doctor</span></a></li>
		<li><a href="login.jsp?lang=${param.lang}"><span style = "padding-left : 5px">Lab Tests</span></a></li>
		<li><a href="login.jsp?lang=${param.lang}"><span style = "padding-left : 5px">Help</span></a></li>
	</ul>
</nav>
</body>
</html>