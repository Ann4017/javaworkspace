<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String check_val = request.getParameter("inactive_today");
	
	if (check_val != null && check_val.equals("1")) {
		Cookie cookie = new Cookie("popup_close", "off");
		cookie.setPath(request.getContextPath());
		cookie.setMaxAge(3600 * 24); 
		response.addCookie(cookie); 
		out.println("쿠키 : 하루 동안 열지 않음");
	}
%>