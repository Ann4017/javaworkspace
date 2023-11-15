<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model1.board.BoardDAO"%>
<%@ page import="model1.board.BoardDTO"%>
<%
	String num = request.getParameter("num");

	BoardDAO dao = new BoardDAO(application);
	BoardDTO dto = new BoardDTO();

	// 1. 조회수 증가
	dao.update_visitcount(num);
	// 2. 해당 글의 데이터 조회
	dto = dao.select_view(num);

	dao.close();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	// 이벤트 처리 및 페이지 이동 방식 
	// 1. (HTML) <form action="" method="">
	//    <button type="submit">
	// 2. (js) <button onclick="location.href=''"
	// 3. (js) <button onclick="함수호출()">
	// function 함수() {
	// 	form.action="";
	// 	form.method="";
	// 	form.submit();
	// }

	function delete_post() {
		var confirmed = confirm("게시물을 삭제 하시겠습니까?");
		if (confirmed) {
			var form = document.write_frm;
			form.method = "post";
			form.action = "DeleteProcess.jsp"
			form.submit();
		}
	}
</script>
</head>
<body>
	<jsp:include page="/common/Link.jsp"></jsp:include>
	<h2>상세 보기</h2>
	<form name="write_frm">
		<input type="hidden" name="num" value="<%=num%>">
		<table border="1" width="90%">
			<tr>
				<td>번호</td>
				<td><%=dto.getNum()%></td>
				<td>작성자</td>
				<td><%=dto.getName()%></td>
			</tr>

			<tr>
				<td>작성일</td>
				<td><%=dto.getPostdate()%></td>
				<td>조회수</td>
				<td><%=dto.getVisitcount()%></td>
			</tr>

			<tr>
				<td>제목</td>
				<td colspan="3"><%=dto.getTitle()%></td>
			</tr>

			<tr>
				<td>내용</td>
				<td colspan="3" height="100"><%=dto.getContent()%></td>
			</tr>

			<tr>
				<td colspan="4" align="right">
					<%
						if (session.getAttribute("user_id") != null
								&& session.getAttribute("user_id").toString().equals(dto.getId())) {
					%>
					<button type="button" onclick="location.href='Edit.jsp?num=<%=dto.getNum()%>'">수정하기</button>
					<button type="button" onclick="delete_post()">삭제하기</button> <%
 	}
 %>
					<button type="button" onclick="location.href='List.jsp'">목록보기</button>
				</td>
			</tr>
		</table>
	</form>

</body>
</html>