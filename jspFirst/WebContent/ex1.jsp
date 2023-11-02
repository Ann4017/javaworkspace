<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="firstJSP.jsp" %>
    
    <%
    	// 지시자
    	// <%@ page>(필수) : 현재 문서는 jsp 형식의 문서이다.
    	// <%@ include> : 문서 여러개를 하나로 합치는 역할
    	// <%@ taglib> : 문법의 정의를 태그 형식으로 작성
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 	ex1.jsp에 firstJSP를 포함시킴 -->
	<%= today %>
</body>
</html>