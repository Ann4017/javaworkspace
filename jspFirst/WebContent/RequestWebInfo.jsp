<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%

	request.setCharacterEncoding("utf-8");

    String eng = request.getParameter("eng");
    String han = request.getParameter("han");
    
    String url = request.getRequestURL().toString();
    String uri = request.getRequestURI();
    
    String queryString = request.getQueryString();
%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
  </head>
  <body>
  <%= eng %>
  <br>
  <%= han %>
    <br>
  <%= url %>
    <br>
  <%= uri %>
    <br>
  <%= queryString %>
  </body>
</html>
