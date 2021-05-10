<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<form action="/testspring/login/result.do" method="post">
<table>
	<tr><td><input type="text" name="id" ></td></tr>
	<tr><td><input type="password" name="pwd" value="1234"></td></tr>
	<tr><td><input type="submit" value="로그인"></td></tr>
</table>
</form>
</body>
</html>