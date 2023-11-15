<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model1.board.BoardDAO"%>
<%@ page import="model1.board.BoardDTO"%>
<%@ include file="IsLoggedIn.jsp"%>
<%
	request.setCharacterEncoding("utf-8");
	
	BoardDTO dto = new BoardDTO();
	BoardDAO dao = new BoardDAO(application);

	String num = request.getParameter("num");
	String title = request.getParameter("title");
	String content = request.getParameter("content");

	dto.setNum(num);
	dto.setTitle(title);
	dto.setContent(content);

	int result = dao.update_edit(dto);

	dao.close();

	if (result > 0) {
		response.sendRedirect("View.jsp?num=" + dto.getNum());
	} else {
		JSFunction.alert_back("수정 실패", out);
	}
%>