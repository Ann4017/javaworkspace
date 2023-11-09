<%@page import="java.sql.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.Statement"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="common.JDBConnect"%>
<%@ page import="common.ConnectionPool"%>
<%
	ConnectionPool pool = new ConnectionPool();
	
	String sql = "select * from member";
	
	Statement stmt = pool.conn.createStatement();
	
	ResultSet rs = stmt.executeQuery(sql);
	
	while(rs.next()){
		String id = rs.getString("id");
		String pass = rs.getString("pass");
		String name = rs.getString("name");
		Date date = rs.getDate("regidate");
		
		out.print(String.format("%s %s %s %s", id, pass, name, date) + "<br><br>");		
	}
	pool.close();
%>