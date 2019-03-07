 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<div align="center">
		<form name="registerForm" action="bankingAccountDetail" method="post" >
				<h3>Enter your Account Number</h3><br>
						<input type="text" name="accountNo"><br>
					<br><br>
			<button type="submit" >Submit</button>
			<a href="index">||Home||</a>
				
			</form>
	</div>
			<div align="center" class="error">
		${errorMessage}
	</div>
</body>
</html>
