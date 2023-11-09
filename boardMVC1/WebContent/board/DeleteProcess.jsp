<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model1.board.BoardDAO"%>
<%@ page import="model1.board.BoardDTO"%>
<%@ include file="IsLoggedIn.jsp"%>
<%
	request.setCharacterEncoding("utf-8");

	BoardDTO dto = new BoardDTO();
	BoardDAO dao = new BoardDAO(application);
	String num = request.getParameter("num");

	dto = dao.select_view(num);
	String session_id = session.getAttribute("user_id").toString();

	if (session_id.equals(dto.getId())) {
		dto.setNum(num);
		int result = dao.delete_post(dto);
		// 삭제 성공 시 List.jsp
		if (result > 0) {
			JSFunction.alert_location("삭제 성공", "List.jsp", out);
		} else {
			// 삭제 실패 시 history.back()
			JSFunction.alert_back("삭제 실패", out);
		}
	} else {
		JSFunction.alert_back("작성자만 삭제 가능합니다.", out);
	}

	dao.close();
%>
