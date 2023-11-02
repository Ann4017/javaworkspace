<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="utils.CookieManager" %>
<%
	String login_id = CookieManager.read_cookie(request, "login_id");	
	String cookie_check = "";
	if(!login_id.equals("")) {
		cookie_check = "checked";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="idSaveProcess.jsp" method="post">
		id : <input name="user_id" value="<%= login_id %>"><br>
		pwd : <input type="password" name="user_pwd" value=""><br>
		<input type="checkbox" name="save_check" value="Y" <%= cookie_check %> > id save<br>
		<input type="submit" value="login"><br>
	</form>
</body>
</html>