<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ page import="java.util.Date" %>
<%
	// 자바 코드
//     String str1 = "jsp";
// 	String str2 = "3.0";
// 	out.print(str1 + str2);
	
	Date today = new Date();
// 	out.print(today);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background: gray;">
<%= today %> 
<%= today %> 
</body>
</html>