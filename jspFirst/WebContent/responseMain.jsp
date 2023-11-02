<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String login_err = request.getParameter("loginErr");
	if (login_err != null) {
		out.print("로그인 실패");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="./responseLogin.jsp" method="post">
		id : <input name="user_id"><br>
		pwd : <input type="password" name="user_pwd"><br>
		<input type="submit" value="login">
	</form>
	
	<form action="./responseHeader.jsp" method="get">
		날짜 형식 : <input name="add_date" value="2023-10-31"><br>
		숫자 형식 : <input name="add_int" value="8282"><br>
		문자 형식 : <input name="add_str" value="한글"><br>
		<input type="submit" value="응답 헤더 설정 및 출력">
	</form>
</body>
</html>