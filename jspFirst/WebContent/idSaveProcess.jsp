<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="utils.CookieManager" %>
<%@ page import="utils.JSFunction" %>
<%
	String user_id = request.getParameter("user_id");
	String user_pwd = request.getParameter("user_pwd");
	String save_check = request.getParameter("save_check");
	
// 	Cookie login_cookie = new Cookie("login_id", user_id);
// 	login_cookie.setPath(request.getContextPath());
// 	login_cookie.setMaxAge(0); 
// 	response.addCookie(login_cookie);
	
// 	Cookie save_check_cookie = new Cookie("login_id", save_check);
// 	save_check_cookie.setPath(request.getContextPath());
// 	save_check_cookie.setMaxAge(0); 
// 	response.addCookie(save_check_cookie);
	
	if (user_id.equals("must") && user_pwd.equals("1234")){
		if (save_check != null && save_check.equals("Y")) {
			CookieManager.make_cookie("login_id", user_id, 86400, response);
		} else {
			CookieManager.delete_cookie("login_id", response);
		}
		
// 		out.print("<script>alert('로그인 성공'); location.href='./idSaveMain.jsp'</script>"); // 성공 시 페이지 이동
		JSFunction.alert_location("로그인 성공", "./idSaveMain.jsp", out);
	} else {
// 		out.print("<script>alert('로그인 실패'); history.back()</script>"); // 로그인 실패 시  스택에 쌓인 이전 페이지 이동
		JSFunction.alert_back("로그인 실패", out);
	}

// 	response.sendRedirect("./idSaveMain.jsp");
%>