<%@page import="model1.board.BoardDTO"%>
<%@page import="model1.board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="IsLoggedIn.jsp" %>
<%
	request.setCharacterEncoding("utf-8");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	
	BoardDTO dto = new BoardDTO();
	dto.setTitle(title);
	dto.setContent(content);
	dto.setId(session.getAttribute("user_id").toString());
	
	BoardDAO dao = new BoardDAO(application);
	int result = dao.insert_write(dto);
	dao.close();
	
	if (result > 0) {
		response.sendRedirect("List.jsp");
	} else {
// 		out.print("<script>alert('글쓰기 실패'); history.back();</script>");
		JSFunction.alert_back("글쓰기 실패", out);
	}
	
%>