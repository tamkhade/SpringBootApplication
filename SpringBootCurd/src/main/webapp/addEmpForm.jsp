<html>
<body>
	<%@include file="header.jsp"%>
	<form action="saveData" method="post">
		<table>
			<tr>
				<td>Emp Name:</td>
				<td><input type="text" name="empName" value="${emp.empName}"
					placeholder="Enter Emp Name" /></td>
			</tr>
			<tr>
				<td>Emp Salary :</td>
				<td><input type="text" name="empSal" value="${emp.empSal}"
					placeholder="Enter Emp Salary" /></td>
			</tr>
			<tr>
				<td>Emp Email :</td>
				<td><input type="text" name="empEmail" value="${emp.empEmail}"
					placeholder="Enter Emp Email" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset" /></td>
				<td><input type="submit" value="Save/Update" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
