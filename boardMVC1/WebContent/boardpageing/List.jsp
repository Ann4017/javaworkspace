<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model1.board.BoardDAO"%>
<%@ page import="model1.board.BoardDTO"%>
<%@ page import="utils.BoardPage" %>
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

	// 전체 페이지 수 계산
	int page_size = Integer.parseInt(application.getInitParameter("posts_per_page"));
	int block_size = Integer.parseInt(application.getInitParameter("posts_per_block"));
	int total_page = (int) Math.ceil((double) total_cnt / page_size);

	// 현재 페이지 확인
	int page_num = 1;
	String page_temp = request.getParameter("page_num");
	
	if (page_temp != null && !page_temp.equals("")) {
		page_num = Integer.parseInt(page_temp);
	}

	int start = (page_num - 1) * page_size + 1;
	int end = page_num * page_size;

	param.put("start", start);
	param.put("end", end);
	ArrayList<BoardDTO> board_lists = dao.select_list_page(param);

	// 	ArrayList<BoardDTO> board_lists = dao.select_list(param);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="/common/Link.jsp"></jsp:include>
	<h2>
		목록 보기(PageingList) - 현재 페이지 :
		<%=page_num%>
		전체 페이지 :
		<%=total_page%></h2>
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
				int v_num = 0;
				int count_num = 0;
				for (BoardDTO dto : board_lists) {
					v_num = total_cnt - (((page_num - 1) * page_size) + count_num++);
		%>
		<tr align="center">
			<td><%=v_num%></td>
			<td><a href="View.jsp?num=<%=dto.getNum()%>"><%=dto.getTitle()%></a></td>
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
		<tr align="center">
			<td>
				<%= BoardPage.pageing_str(total_cnt, page_size, block_size, page_num, request.getRequestURI()) %>
			</td>
			<td align="right">
				<button onclick="location.href='Write.jsp'">글쓰기</button>
			</td>
		</tr>
	</table>
</body>
</html>