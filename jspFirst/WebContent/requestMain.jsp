<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
  </head>
  <body>
  <%-- key=value --%>
  <a href="./RequestWebInfo.jsp?eng=Hello&han=안녕">Get 방식 전송</a> 
  
  <form action="./RequestWebInfo.jsp" method="post">
  	영어 : <input type="text" name="eng" value="Bye"><br>
  	한글 : <input type="text" name="han" value="잘가"><br>
	<input type="submit" value="Post 방식 전송">
  </form>
  </body>
</html>
