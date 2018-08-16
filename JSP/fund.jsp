<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- describes about fund transfer -->
	<form action="successfund" method="post">
		<table>
			<tr>
				<td><input type="number" name="fromAccNo">Enter the
					source account number</td>
				<td><input type="number" name="toAccNo">Enter the
					destination account number</td>
				<td><input type="number" name="amount">Enter the amount</td>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>

	</form>
</body>
</html>