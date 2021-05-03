<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Output View JSP</title>
</head>
<body>
<%
	ArrayList<String> result = (ArrayList<String>)session.getAttribute("data");
	for(String temp : result){
		out.print(temp+"<br>");
	}
%>
</body>
</html>