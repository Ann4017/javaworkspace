<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3><%= application.getInitParameter("init_param") %></h3>
<h3><%= application.getRealPath("/")%></h3>
<!--  C:\Users\abh\work\javaworkspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\jspFirst\ -->
</body>
</html>