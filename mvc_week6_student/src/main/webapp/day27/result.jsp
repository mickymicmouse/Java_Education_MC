<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ page import= "mc.sn.vo.LoginVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
<%
	LoginVO vo = (LoginVO)session.getAttribute("vo");
	if (vo == null){
		out.print("해당하는 사용자가 없습니다.");
	}else {
		out.print(vo.getId() + "님 반갑습니다.");
	}
%>
</body>
</html>