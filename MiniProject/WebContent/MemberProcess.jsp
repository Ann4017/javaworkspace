<%@page import="member.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String pass = request.getParameter("passs");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String comment = request.getParameter("comment");
	
	MemberDTO dto = new MemberDTO();
	MemberDAO dao = new MemberDAO();
	
	dto.setId(id);
	dto.setPass(pass);
	dto.setName(name);
	dto.setEmail(email);
	dto.setComment(comment);
	
	System.out.print(dto.getId());

// 	int result = dao.insert_user_info(dto);
// 	dao.close();
%>