<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>파일 첨부형 게시판 - 목록 보기(List)</h2>

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
			<th width="*">제목</th>
			<th width="15%">작성자</th>
			<th width="10%">조회수</th>
			<th width="15%">작성일</th>
			<th width="8%">첨부</th>
		</tr>



		<c:choose>
			<c:when test="${empty board_lists }">
				<tr>
					<td colspan="6" align="center">등록 된 게시물이 없습니다.</td>
				</tr>
			</c:when>

			<c:otherwise>
				<c:forEach items="${board_lists }" var="row" varStatus="loop">
					<tr align="center">
						<td>${params.total_cnt - (((params.page_num - 1) * params.page_size) + loop.index)}</td>
						<td>${row.title }</td>
						<td>${row.name }</td>
						<td>${row.visitcount }</td>
						<td>${row.postdate }</td>
						<td>[Down]</td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>


		<tr align="center">
			<td align="center" colspan="5">${params.pageing }</td>
			<td colspan="1">
				<button onclick="location.href='./write.do'">글쓰기</button>
			</td>
		</tr>
	</table>

</body>
</html>