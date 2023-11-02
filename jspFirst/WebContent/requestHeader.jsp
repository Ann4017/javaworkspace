<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	Enumeration<String> headers =	request.getHeaderNames();
	while(headers.hasMoreElements()){
		String header_name = headers.nextElement();
		String header_value = request.getHeader(header_name);
		out.print(header_name + " : " + header_value + "<br>");
	}
	%>
</body>
</html>