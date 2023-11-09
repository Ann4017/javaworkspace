<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	pageContext.setAttribute("pAttr", "김유신");
	request.setAttribute("rAttr", "계백");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	// 페이지 이동
	// Redirect : 단순한 페이지 이동 request 객체를 새로 생성한다. url 주소가 해당 파일로 변경된다.
	// Forward: (request, response) 에 대한 제어권 이동. url 주소 그대로 유지.
</script>
</head>
<body>
	<jsp:forward page="./ForwardSub.jsp">
		<jsp:param value="홍길동" name="id" />
		<jsp:param value="10" name="age" />
	</jsp:forward>
</body>
</html>