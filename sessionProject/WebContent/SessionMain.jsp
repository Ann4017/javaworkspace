<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%
	SimpleDateFormat date_format = new SimpleDateFormat("hh:mm:ss");
	long creation_time = session.getCreationTime();
	String time_str = date_format.format(new Date(creation_time));
	
	long last_time = session.getLastAccessedTime();
	String last_str = date_format.format(new Date(last_time));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p><%= time_str %></p>
	<p><%= last_str %></p>
	<p><%= session.getMaxInactiveInterval() %></p>
	<p><%= session.getId() %></p>
</body>
</html>