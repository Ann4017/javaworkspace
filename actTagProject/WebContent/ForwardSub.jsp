<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String age = request.getParameter("age");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	page 영역 : <%= pageContext.getAttribute("pAttr") %><br>
	request 영역 : <%= request.getAttribute("rAttr") %><br>
	
	id : <%= id %><br>
	age : <%= age %><br>
</body>
</html>