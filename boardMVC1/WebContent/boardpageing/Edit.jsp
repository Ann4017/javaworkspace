<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model1.board.BoardDAO"%>
<%@ page import="model1.board.BoardDTO"%>
<%@ include file="IsLoggedIn.jsp"%>
<%
	String num = request.getParameter("num");

	BoardDAO dao = new BoardDAO(application);
	BoardDTO dto = new BoardDTO();

	dto = dao.select_view(num);

	if (!session.getAttribute("user_id").toString().equals(dto.getId())) {
		JSFunction.alert_back("작성자만 수정 가능합니다.", out);
		return;
	}

	dao.close();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function validateForm(_form) {
		if (_form.title.value == "") {
			alert("제목을 입력 해주세요.")
			_form.title.focus();
			return false;
		}
		if (_form.content.value == "") {
			alert("내용을 입력 해주세요.")
			_form.content.focus();
			return false;
		}
	}
</script>
</head>
<body>
	<jsp:include page="/common/Link.jsp"></jsp:include>
	<h2>수정하기</h2>

	<form name="write_frm" method="post" action="EditProcess.jsp" onsubmit="return validateForm(this)">
		<input type="hidden" name="num" value="<%=num%>">
		<table border="1" width="90%">
			<tr>
				<td>제목</td>
				<td><input type="text" name="title" style="width: 90%" value="<%=dto.getTitle()%>"></td>
			</tr>

			<tr>
				<td>내용</td>
				<td><textarea rows="" cols="" name="content" style="width: 90%; height: 100px;"><%=dto.getContent()%></textarea></td>
			</tr>

			<tr>
				<td colspan="2" align="right">
					<button type="submit">수정완료</button>
					<button type="reset">다시입력</button>
					<button type="button" onclick="location.href='List.jsp'">목록보기</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>