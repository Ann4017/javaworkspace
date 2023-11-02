<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 

	// response 객체	
	// .sendRedirect(페이지 경로) : 페이지를 이동한다.

	String id = request.getParameter("user_id");
	String pwd = request.getParameter("user_pwd");
	
	if(id.equals("asd") && pwd.equals("1234")) {
		response.sendRedirect("./responseWelcome.jsp");		
	} else {
// 		response.sendRedirect("./responseMain.jsp");
		request.getRequestDispatcher("./responseMain.jsp?loginErr=1").forward(request, response); // 응답의 역할이 아닌 페이지 이동의 역할
	}
%>