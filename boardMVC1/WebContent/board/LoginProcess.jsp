<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="common.ConnectionPool"%>
<%@ page import="membership.MemberDTO"%>
<%@ page import="membership.MemberDAO"%>
<% 
	String user_id = request.getParameter("user_id");
	String user_pw = request.getParameter("user_pw");
	
	String driver = application.getInitParameter("OracleDriver");
	String url = application.getInitParameter("OracleUrl");
	String id = application.getInitParameter("OracleId");
	String pwd = application.getInitParameter("OraclePwd");
	
	MemberDAO dao = new MemberDAO(driver, url, id, pwd);
	MemberDTO dto = dao.get_memberDTO(user_id, user_pw);
	
	if(dto.getId() != null) {
		// 로그인 성공
		session.setAttribute("user_id", dto.getId());
		session.setAttribute("user_name", dto.getName());
		request.setAttribute("LoginSuccessMsg", "로그인 성공");
		request.getRequestDispatcher("LoginForm.jsp").forward(request, response);
	} else {
		// 로그인 실패
		request.setAttribute("LoginErrMsg", "로그인 실패");
		request.getRequestDispatcher("LoginForm.jsp").forward(request, response);
	}
	
%>