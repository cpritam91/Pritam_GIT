<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter Patient Details</title>
<link href="css/Styles.css" type = "text/css" rel = "stylesheet"/>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
</head>
<body>
	<div id="flag">
	<a href="PatientDetails.jsp?lang=en"><img src="images/en.jpg" width="30px" height="20px"></a> &nbsp;
	<a href="PatientDetails.jsp?lang=fr"><img src="images/fr.gif" width="30px" height="20px"></a>
	</div>
	<br/><br/>
	<c:import url="Header.jsp"/>
	<nav>
	<ul>
		<li><a href="PatientDetails.jsp?lang=${param.lang}"><span style = "padding-left : 5px">Create Test Order</span></a></li>
		<li><a href="PatientDetails.jsp?lang=${param.lang}"><span style = "padding-left : 5px">Add Test Result</span></a></li>
		<li><a href="PatientDetails.jsp?lang=${param.lang}"><span style = "padding-left : 5px">View Test Report</span></a></li>
	</ul>
	</nav>
	<h2 id="codeAttribute">Lab Code : <c:out value="${param.labCode}"/></h2>
	<br><br>
	<form action="">
	<table>
	<tr>
		<td>Order Number</td>
		<td><input type="text" name="orderNo"></td>
		<td>Collection Date</td>
		<td><input type="date" name="collDate"></td>
		<td>Collection Type</td>
		<td><input type="radio" value="Lab" name="collType" checked="checked">Lab
			<input type="radio" value="Home" name="collType">Home
		</td>
	</tr>	
	<tr>
		<td>Patient Code</td>
		<td><input type="text" name="patientCode" id="patientCode"></td>
		<td>Patient Name</td>
		<td><input type="text" name="patientName" id="patientName"></td>
		<td>Age</td>
		<td><input type="text" name="age" id="age"></td>
	</tr>
	<tr>
		<td>Hand Phone</td>
		<td><input type="text" name="handPhone" id="handPhone"></td>
		<td>Email</td>
		<td><input type="text" name="email" id="email" size = "30"></td>
		<td>Gender</td>
		<td><input type="radio" value="Male" name="gender" checked="checked">Male
			<input type="radio" value="Female" name="gender">Female
		</td>
	</tr>
	<tr>
		<td colspan="2">Doctor Code</td>
		<td><input type="text" name="doctorCode" id="docId"></td>
		<td>Doctor Name</td>
		<td colspan="2"><input type="text" name="doctorName" id="docName"></td>
	</tr>
	</table>
	<br><h1> Test Details </h1><br>
	<table id="TestList">
		<tr>
			<th>Test Code</th>
			<th>Test Name</th>
			<th>Test Amount</th>
		</tr>
	
		<c:forEach var="i" begin="1" end="5">
			<tr>
				<td><input type="text" id="testCode${i}"></td>
				<td id="testName${i}"></td>
				<td id="testAmt${i}"></td>
			</tr>
		 </c:forEach>
		<tr id="totalAmt">
			<td colspan="2">Total</td>
			<td></td>
		</tr>
	</table>
	<div id="buttonSet">
		<input type="button" class="addTest" value="Add More Tests">
		<input type="submit" id="submitTest" value="Confirm Tests">
	</div>
	</form>
	<br><br>
	<c:import url="Footer.jsp"></c:import>
</body>
<script type="text/javascript" src = "jslibs/jquery-1.12.1.js"></script>
<script type="text/javascript" src = "scripts/patientAjax.js"></script>
</html>