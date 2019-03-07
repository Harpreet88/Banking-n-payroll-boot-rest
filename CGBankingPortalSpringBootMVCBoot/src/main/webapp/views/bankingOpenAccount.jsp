<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Open Account</title>
<style>
.error {
	color: red;
	font-weight: bold;
}
</style>
</head>
<body>
	<div align="center">Open Account</div>
	<form:form action="registerAssociate" method="post" modelAttribute="account">
		<table>
			<tr>
				<td>Select Account Type</td>
				<td><select type="text" name="accountType">
						<option>Savings</option>
						<option>Current</option>
				</select></td>
				<td><form:errors path="accountType" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Enter Initial Balance</td>
				<td><input type="text" name="accountBalance" required></td>
				<td><form:errors path="accountBalance" cssClass="error"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>
		<div align="center" class="error">
		${errorMessage}
	</div>
	</form:form>
</body>
</html>