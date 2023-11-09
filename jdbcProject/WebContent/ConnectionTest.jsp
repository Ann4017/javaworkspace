<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="common.JDBConnect"%>
<%@ page import="common.ConnectionPool"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 1. 일반적인 jdbc 연결방식 -->
<!-- 2. 커넥션 풀을 사용 한 jdbc 연결방식 -->
	<h2>JDBC TEST 1</h2>
	<% 
		JDBConnect jdbc1 = new JDBConnect();
		jdbc1.close();
	%>
	
	<h2>JDBC TEST 2</h2>
	<%
		String driver = application.getInitParameter("OracleDriver");
		String url = application.getInitParameter("OracleUrl");
		String id = application.getInitParameter("OracleId");
		String pwd = application.getInitParameter("OraclePwd");
		
		JDBConnect jdbc2 = new JDBConnect(driver, url, id, pwd);
		jdbc2.close();
	%>
	
	<h2>JDBC TEST 3</h2>
	<%
		JDBConnect jdbc3 = new JDBConnect(application);
		jdbc3.close();
	%>
	
	<h2>Connection pool TEST</h2>
	<%
		ConnectionPool cp = new ConnectionPool();
		cp.close();
	%>
</body>
</html>