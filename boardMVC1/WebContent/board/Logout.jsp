<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	session.removeAttribute("user_id");
	session.removeAttribute("user_name");
	
// 	session.invalidate(); 세션 내 모든 정보 삭제

	response.sendRedirect("LoginForm.jsp");
%>