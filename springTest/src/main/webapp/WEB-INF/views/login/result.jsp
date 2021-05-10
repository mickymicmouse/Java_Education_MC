<%@page import="mc.sn.testspring.member.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
Result
<%
	MemberVO vo = (MemberVO)session.getAttribute("member");
	if (vo!=null){
		out.print(vo.getName()+"님 반갑습니다.");
	} else {
		out.print("로그인 정보가 정확하지 않습니다.");
	}

%>
</body>
</html>