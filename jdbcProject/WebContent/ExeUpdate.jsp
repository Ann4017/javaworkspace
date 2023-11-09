<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="common.JDBConnect"%>
<%@ page import="common.ConnectionPool"%>
<%
	ConnectionPool pool = new ConnectionPool();
	pool.conn.setAutoCommit(false);


//------------------------------------------------ insert

// 	String id = "a0001";
// 	String pwd = "00001";
// 	String name = "t0001";

// 	String sql = "insert into member values('a001', '1234', 'hong', sysdate)";
// 	String sql = "insert into member values(?, ?, ?, sysdate)";
	
// 	Statement stmt = pool.conn.createStatement();
// 	PreparedStatement pstmt = pool.conn.prepareStatement(sql);
// 	setInt, setFloat, setString, setDate, ... 동적인 방식은 쿼리 값을 미리 지정함
// 	pstmt.setString(1, id);
// 	pstmt.setString(2, pwd);
// 	pstmt.setString(3, name);
	
	// exeuteQuery : select 실행
	// executeUpdate() : insert, update, delete 실행
	
	
// ------------------------------------------------ update
// 	String sql = "update member set pass = ?, name = ? where id = ?";
// 	PreparedStatement pstmt = pool.conn.prepareStatement(sql);
	
// 	pstmt.setString(1, "0001");
// 	pstmt.setString(2, "new");
// 	pstmt.setString(3, "a001");

// ------------------------------------------------ delete
	String sql = "delete from member where id = ?";
 	PreparedStatement pstmt = pool.conn.prepareStatement(sql);
	
 	pstmt.setString(1, "a0001");

 	
// ------------------------------------------------ query 실행
// 	int result = stmt.executeUpdate(sql); // 성공 시 1 이상, 실패시 0 반환
	int result = pstmt.executeUpdate();
	if (result != 0) {
		out.print("delete 성공");
		pool.conn.commit();
	} else {
		out.print("delete 실패");
		pool.conn.rollback();
	}

	pool.close();
	
	// 트랜잭션 (commit, rollback)
	// jsp는 기본적으로  auto commit
	
	
%>