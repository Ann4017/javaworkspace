<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.google.gson.*" %>

<%
	request.setCharacterEncoding("utf-8");
	String user_id = request.getParameter("user_id");
	String message = " 님 로그인 성공";
	
	Gson gson = new Gson();
	JsonObject obj = new JsonObject();
	
	obj.addProperty("login_id", user_id);
	obj.addProperty("login_success", message);
	
	out.print(gson.toJson(obj));
%>