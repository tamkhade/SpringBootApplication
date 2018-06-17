<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">
	function confirmDelete() {
		var status = confirm("Are you sure, you want to delete ?");
		if (status) {
			return true;
		} else {
			return false;
		}
	}
</script>

</head>
<body>
	<%@include file="header.jsp"%>
	<table border="1">
		<tr>
			<th>EMP ID</th>
			<th>EMP NAME</th>
			<th>EMP SALARY</th>
			<th>EMP EMAIL</th>
			<th>ACTION</th>
		</tr>
		<c:forEach items="${empList}" var="emp">
			<tr>
				<td><c:out value="${emp.empId}" /></td>
				<td><c:out value="${emp.empName}" /></td>
				<td><c:out value="${emp.empSal}" /></td>
				<td><c:out value="${emp.empEmail}" /></td>
				<td><a href="delete?empId=${emp.empId}"><img
						src="images/delete.png" width="20" height="20"
						onclick="return confirmDelete()" /></a>
				<a href="edit?empId=${emp.empId}"><img src="images/edit.png"
						width="20" height="20" /></a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>