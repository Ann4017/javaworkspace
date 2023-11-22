<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String user_id = request.getParameter("user_id");	
%>

{
	"login_id": "<%= user_id %>",
	"login_success": "님 로그인 성공"
}