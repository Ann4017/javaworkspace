<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="javax.sql.DataSource" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.naming.Context" %>
    
<%
// JNDI 방식 connection full
Context initCtx = new InitialContext();
Context envCtx = (Context) initCtx.lookup("java:comp/env");

DataSource ds = (DataSource)
envCtx.lookup("dbcp_myoracle");

Connection conn = ds.getConnection();

if (conn != null) {
	out.print("접속 성공");
} else {
	out.print("접속 실패");
}

// conn.close();    
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>