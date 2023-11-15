<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="utils.CookieManager"%>
<%
	int num1 = 10;
	int num2 = 20;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
</script>
</head>
<body>
	<%CookieManager.make_cookie("ELCookie", "ELCookieeeee쿠키", 100, response);%>
	
	<p> EL쿠키값 : ${cookie.ELCookie.value }</p>
	<p>덧셈 : ${num1 * num2 }</p>
</body>
</html>