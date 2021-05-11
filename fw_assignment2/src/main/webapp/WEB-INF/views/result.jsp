<%@page import="mc.sn.main.member.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
Result: 
<%	
	MemberVO vo = (MemberVO)session.getAttribute("member");
	String result = "로그인 정보가 정확하지 않습니다.";
	String resultback = "로그인 정보가 정확하지 않습니다.";
	if (vo!=null){
		result = "Data: "+ vo.getName()+" login ok \\n Status: Success";
		resultback = "Data: "+ vo.getName()+" login ok <br> Status: Success";
		
	}
	String alertMessage = "<script>alert('"+result+"')</script>";
	out.print(resultback);
	out.print(alertMessage);
	session.invalidate();
%>


</body>
</html>