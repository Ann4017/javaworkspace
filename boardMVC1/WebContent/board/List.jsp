<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model1.board.BoardDAO"%>
<%@ page import="model1.board.BoardDTO"%>
<%@ page import="java.util.*"%>
<%
	String search_field = request.getParameter("search_field");
	String search_word = request.getParameter("search_word");

	Map<String, Object> param = new HashMap<>();

	if (search_word != null) {
		param.put("search_field", search_field);
		param.put("search_word", search_word);
	}

	BoardDAO dao = new BoardDAO(application);
	int total_cnt = dao.select_count(param);
	ArrayList<BoardDTO> board_lists = dao.select_list(param);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="/common/Link.jsp"></jsp:include>
	<h2>목록 보기(List)</h2>
	<!-- 	검색 폼 -->
	<form action="">
		<!-- action 속성이 정의 되지 않으면 현재 페이지로 이동한다. -->
		<table border="1" width="90%">
			<tr align="center">
				<td><select name="search_field">
						<option value="title">제목</option>
						<option value="content">내용</option>
				</select> <input name="search_word"> <input type="submit" value="검색"></td>
			</tr>
		</table>
	</form>

	<table border="1" width="90%">
		<tr>
			<th width="10%">번호</th>
			<th width="50%">제목</th>
			<th width="15%">작성자</th>
			<th width="10%">조회수</th>
			<th width="15%">작성일</th>
		</tr>

		<%
			if (board_lists.isEmpty()) {
		%>
		<tr>
			<td></td>
			<td align="center">등록 된 게시물이 없습니다.</td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<%
			} else {
				for (BoardDTO dto : board_lists) {
		%>
		<tr align="center">
			<td><%=total_cnt--%></td>
			<td>
				<a href="View.jsp?num=<%=dto.getNum()%>"><%=dto.getTitle()%></a>
			</td>
			<td><%=dto.getId()%></td>
			<td><%=dto.getVisitcount()%></td>
			<td><%=dto.getPostdate()%></td>
		</tr>
		<%
			}
			}
		%>

	</table>

	<table border="1" width="90%">
		<tr align="right">
			<td>
				<button onclick="location.href='Write.jsp'">글쓰기</button>
			</td>
		</tr>
	</table>
</body>
</html>