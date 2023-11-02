<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	Cookie cookie = new Cookie("my_cookie", "쿠키");
	cookie.setPath(request.getContextPath());
	cookie.setMaxAge(3600); // 쿠키 1시간 유효 지정
	response.addCookie(cookie); // 클라 쪽으로 쿠키 넘김
	
	Cookie cookie2 = new Cookie("my_cookie2", "쿠키2");
	cookie.setPath(request.getContextPath());
	cookie.setMaxAge(5); 
	response.addCookie(cookie2); 
%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 프로젝트 명 -->
<%-- <%= request.getContextPath() %>  --%>
<%	Cookie[] cookies = request.getCookies(); // request header 영역에서 가져옴 
	if (cookies != null){
		for(Cookie c : cookies) {
			String cookie_name = c.getName();
			String cookie_value = c.getValue();
			out.print("<br>" + cookie_name + " : " + cookie_value);
		}
	}
%>

<a href="cookieResult.jsp">쿠키 정보확인</a>
</body>
</html>