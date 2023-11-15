<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="fileupload.MyfileDAO"%>
<%@ page import="fileupload.MyflieDTO"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	MyfileDAO dao = new MyfileDAO();
	List<MyflieDTO> file_lists = dao.my_file_list();
	dao.close();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>No</th>
			<th>작성자</th>
			<th>제목</th>
			<th>카테고리</th>
			<th>원본 파일명</th>
			<th>저장 된 파일명</th>
			<th>작성일</th>
			<th></th>
		</tr>

		<%
			for (MyflieDTO f : file_lists) {
		%>
		<tr>
			<td><%=f.getIdx()%></td>
			<td><%=f.getName()%></td>
			<td><%=f.getTitle()%></td>
			<td><%=f.getCate()%></td>
			<td><%=f.getOfile()%></td>
			<td><%=f.getSfile()%></td>
			<td><%=f.getPostdate()%></td>
			<td></td>
		</tr>
		<%
			}
		%>
		
		<c:forEach items="<%=file_lists%>" var="list">
			<tr>
				<td>${list.idx }</td>
				<td>${list.name }</td>
				<td>${list.title }</td>
				<td>${list.cate }</td>
				<td>${list.ofile }</td>
				<td>${list.sfile }</td>
				<td>${list.postdate }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>