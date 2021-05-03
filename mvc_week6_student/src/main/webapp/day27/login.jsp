<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Login</title>
</head>
<body>
	<form action="../login" method="get">
		<table>
			<tr>
				<td>ID : </td>
				<td><input name = "userid" type = "text"></td>
			</tr>
			<tr>
				<td>PASSWORD : </td>
				<td><input name = "userpd" type = "password"></td>
			</tr>
			<tr>
				<td><input type = "submit" value = "login"></td>
			</tr>
		</table>
	</form>
</body>
</html>