<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 스크립트 세가지 요소
	// <%, <%!, <%=  
	// 선언 위치 : 태그 위쪽, body태그 안쪽

	// 스크립틀릿 : 지역 변수
	// <% 자바의 변수 선언, 메소드 정의, 반복문, 조건문

	// 선언문 : 지역 변수가 아닌 위치
	// <%! 자바의 변수 선언, 메소드 정의 

	// 표현식 : 출력기능
	// <%= 출력을 위한 값 (함수, 수식) 
%>

<% int x = 10; %>
<%! int y = 20; %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background: gray;">
<%= x %>
<br>
<%= y %>
</body>
</html>