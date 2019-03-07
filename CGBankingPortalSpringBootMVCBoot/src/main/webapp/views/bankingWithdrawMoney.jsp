
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<div align="center">
		<form name="registerForm" action="bankingWithrawingMoney" method="post" >
			<h2><font color="red">WITHRAWING MONEY</font></h2>
			<br><br><br>
				<br>Enter the Account Number<br><br>
						<br><input type="text" name="accountNo"><br>
				<br><br>Enter the amount<br><br>
						<input type="text" name="amount"><br>
				<br><br>Enter your Pin Number<br><br>
						<input type="text" name="pinNumber"><br>
					
					<br><br>
			<button type="submit" >Submit</button>
			</form>
	</div>
	<div align="center">
			<h2><font color="red">MONEY WITHRAWED</font></h2><br>
			Updated Balance : ${requestScope.balance}<br>
	</div>
ERROR : ${requestScope.error}
</body>
</html>

