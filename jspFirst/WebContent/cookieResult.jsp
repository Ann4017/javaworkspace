<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%	Cookie[] cookies = request.getCookies(); // request header 영역에서 가져옴 
	if (cookies != null){
		for(Cookie c : cookies) {
			String cookie_name = c.getName();
			String cookie_value = c.getValue();
			out.print("<br>" + cookie_name + " : " + cookie_value);
		}
	}
%>
</body>
</html>