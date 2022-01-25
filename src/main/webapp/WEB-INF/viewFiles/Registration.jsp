<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<h1>Register Form</h1>
<form action="registerProcess" method="post">
			<table style="with: 50%">
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstName" /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lastName" /></td>
				</tr>
				<tr>
					<td>UserName</td>
					<td><input type="text" name="userName" /></td>
				</tr>
					<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td>PhoneNumber</td>
					<td><input type="text" name="phoneNumber" pattern="[7-9]{1}[0-9]{9}" /></td>
				</tr>
				</table>
			<input type="submit" value="Submit" /></form>
</body>
</html>