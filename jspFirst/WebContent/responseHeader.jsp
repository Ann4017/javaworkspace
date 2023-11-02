<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="java.text.SimpleDateFormat" %>
<%
	SimpleDateFormat s = new SimpleDateFormat("yyyy-mm-dd");
	long add_date = s.parse(request.getParameter("add_date")).getTime();
	int add_int = Integer.parseInt(request.getParameter("add_int"));
	String add_str = request.getParameter("add_str");
	
	// response header 영역에 값 추가
	response.addDateHeader("my_birth_day", add_date);
	response.addIntHeader("my_phone_num", add_int);
	response.addIntHeader("my_phone_num", 1004);
	response.addHeader("my_name", add_str);
	response.addHeader("my_name", "한글");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Collection<String> header_names = response.getHeaderNames();
		for(String h_name : header_names) {
			String h_value = response.getHeader(h_name);
		
	%>
		<p><%= h_value %></p>
	<%
		}
	%>
</body>
</html>