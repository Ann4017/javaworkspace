<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<table border="1" width="90%">
	<tr align="center">
		<%if (session.getAttribute("user_id") == null) { %>
		<td><a href="LoginForm.jsp">로그인</a></td>
		<%} else { %>
		<td><a href="Logout.jsp">로그아웃</a></td>
		<% } %>
		<td><a href="../board/List.jsp">게시판 페이징(X)</a></td>
		<td><a href="../boardpageing/List.jsp">게시판(페이징O)</a></td>
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
	// 한 화면(블록)에 출력할 페이지 번호 post_per_block = 5
	// 게시물 개수 107
	// 각 페이지 별 게시물의 첫 번호와 마지막 번호
	
	// 1 페이지 : 1 ~ 10 
	// 2 페이지 : 11 ~ 20
	// 첫번째 번호 : (현재 페이지 -1) * post_per_page + 1
	// 마지막 번호 : 현재 페이지 * post_per_page
	
	// 전체 페이지 107 : Math.ceil(107/100) => 11
	// 이동 : 1:1, 2:6, 3:11 |
	// page_temp = ((현재 페이지 - 1) / post_per_block) * post_per_block + 1
	// 이전 블록 : page_temp - 1
	// 다음 블록 : page_temp + 1
	// 페이지 번호 : page_temp 변수 사용 해당 블럭의 페이지 번호를 출력한다.
%>