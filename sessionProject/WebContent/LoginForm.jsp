<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String msg = (String)request.getAttribute("LoginSuccessMsg");
	if (msg != null) {
		out.print(msg);
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function validation_form(_form) {
		// document.loginFrm.user_id.value; // 일반적인 접근 방법
		// _form.user_id.value; 			// this 사용 접근 방법
		
		if(!_form.user_id.value && !_form.user_pw.value) {
			alert("아이디 혹은 패스워드를 입력하세요.");
			_form.user_id.focus();
			return false;
		}
		
	}
</script>
</head>
<body>
	<%
		if (session.getAttribute("user_id") == null) {
	%>
	<form action="LoginProcess.jsp" method="post" name="loginFrm" onsubmit="return validation_form(this)">
		ID : <input type="text" name="user_id"><br>
		PW : <input type="password" name="user_pw"><br>
		<input type="submit" value="Login">
	</form>
	<% } else { %>
	<%= session.getAttribute("user_name") %> 님 환영합니다.
	<a href="Logout.jsp">[로그아웃]</a>
	<% } %>
</body>
</html>