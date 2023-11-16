package common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionPool {

	public Connection conn;
	public Statement stmt;
	public PreparedStatement psmt;
	public ResultSet rs;

	public ConnectionPool() {

		try {
			Context initCtx;
			initCtx = new InitialContext();
			Context envCtx = (Context) initCtx.lookup("java:comp/env");

			DataSource ds = (DataSource) envCtx.lookup("dbcp_myoracle");

			conn = ds.getConnection();

			System.out.println("커넥션 풀 연걸 성공");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void close() {

		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();

			System.out.println("DBCP 커넥션 풀 자원 해제");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
