<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<body>
	<%@include file="header.jsp"%>
	<form:form action="saveData" method="post" modelAttribute="emp">
		<table>

			<tr>
				<td>Emp Name:</td>
				<td><form:input path="empName" placeholder="Enter Emp Name" /></td>
			</tr>
			<tr>
				<td>Emp Salary :</td>
				<td><form:input path="empSal" placeholder="Enter Emp Salary" /></td>
			</tr>
			<tr>
				<td>Emp Email :</td>
				<td><form:input path="empEmail" placeholder="Enter Emp Email" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset" /></td>
				<td><input type="submit" value="Save/Update" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
