<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="utils.JSFunction"%>
<%
	if (session.getAttribute("user_id") == null) {
		// 		response.sendRedirect("LoginForm.jsp");
		JSFunction.alert_location("로그인을 하세요.", "LoginForm.jsp", out);
		return;
	}
%>