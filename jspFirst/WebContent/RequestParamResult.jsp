<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String gender = request.getParameter("gender");
	String[] hobby = request.getParameterValues("hobby");
	String job = request.getParameter("job");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%= gender %>
	<br>
	<%
		for(int i = 0; i < hobby.length; i++){
			out.print(hobby[i]);
	%>
		<%= hobby[i] + ", "%>
	<%
		}
	%>
	<br>
	<%= job %>
	<br>
</body>
</html>