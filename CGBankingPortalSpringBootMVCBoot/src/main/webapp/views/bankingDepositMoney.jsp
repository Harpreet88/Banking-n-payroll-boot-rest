
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<div align ="center">
		<form name="registerForm" action="bankingDepositMoney2" method="post" >
			<h2><font color="red">Deposit money</font></h2>
			<br><br><br>
				<br>Enter the Account Number<br><br>
						<br><input type="text" name="accountNo"><br>
				<br><br>Enter the amount<br><br>
						<input type="text" name="amount"><br>
					
					<br><br>
			<button type="submit" >Submit</button>
			</form>
	</div>
	<hr>
	<div align ="center">
			<h2><font color="red">MONEY DEPOSITED</font></h2><br>
			Updated Balance : ${requestScope.balance}<br>
	</div>
ERROR : ${requestScope.error}
</body>
</html>

