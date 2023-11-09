<%@page import="membership.MemberJoinDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="membership.MemberDAO" %>
<%@ page import="membership.MemberJoinDTO" %>
<%
	String user_id = request.getParameter("id");
	String user_pwd = request.getParameter("pw");
	String addr1 = request.getParameter("addr1");
	String addr2 = request.getParameter("addr2");
	String gender = request.getParameter("gender");
	String[] hobbys = request.getParameterValues("hobby");
	String hys = "";
	for (String h : hobbys) {
		hys += h + ", ";
	}
	String phone1 = request.getParameter("phone1");
	String phone2 = request.getParameter("phone2");
	String phone3 = request.getParameter("phone3");
	String job = request.getParameter("job");
	String content = request.getParameter("content");
	
	System.out.println("취미 : " + hys);
	
	String driver = application.getInitParameter("OracleDriver");
	String url = application.getInitParameter("OracleUrl");
	String id = application.getInitParameter("OracleId");
	String pwd = application.getInitParameter("OraclePwd");
	
	MemberDAO dao = new MemberDAO(driver, url, id, pwd);
	MemberJoinDTO dto = new MemberJoinDTO();
	
	dto.setId(user_id);
	dto.setPwd(user_pwd);
	dto.setAddr1(addr1);
	dto.setAddr2(addr2);
	dto.setGender(gender);
	dto.setHobby(hys);
	dto.setPhone1(phone1);
	dto.setPhone2(phone2);
	dto.setPhone3(phone3);
	dto.setJob(job);
	dto.setContent(content);
	
	int result = dao.insert_memberDTO(dto);
	
	if (result != 0) {
		request.getRequestDispatcher("LoginForm.jsp").forward(request, response);
	} else {
		response.sendRedirect("MemberJoin.jsp");
	}
%>