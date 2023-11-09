<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<table border="1" width="90%">
	<tr align="center">
		<%if (session.getAttribute("user_id") == null) { %>
		<td><a href="LoginForm.jsp">로그인</a></td>
		<%} else { %>
		<td><a href="Logout.jsp">로그아웃</a></td>
		<% } %>
		<td><a href="List.jsp">게시판 페이징(X)</a></td>
		<td><a href="List2.jsp">게시판(페이징O)</a></td>
	</tr>
</table>

<% 
	// 페이징
	
	// 1. 전체 게시글의 개수
	// 2. 한 블록당 표시해야하는 페이지의 개수
	// 3. 한 페이지당 표시해야하는 글의 개수
	// 4. 페이지의 시작번호와 끝번호 계산
	// 5. 최신글의 페이지별로 10개씩 보여주기 위한 쿼리문 작성
	
	// 현재 페이지의 게시물 수 post_per_page = 10
	// 한 화면(블록)에 출력할 페이지 번호 post_per_block = 10
%>