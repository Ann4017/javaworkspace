package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletContext;

public class JDBConnect {

	// DB접속 및 쿼리문 실행에 필요한 필수 객체
	public static Connection conn; // 데이터 베이스 접속
	public static Statement stmt; // CRUD 구문 실행 역할 (정적인 데이터를 사용하여 쿼리문 실행)
	public static PreparedStatement psmt; // CRUD 구문 실행 역할 (동적인 데이터를 사용하여 쿼리문 실행)
	public static ResultSet rs; // select 구문의 실행 결과를 받아주는 역할

	public JDBConnect() {

		try {
			Class.forName("oracle.jdbc.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "musthave";
			String pwd = "1234";

			conn = DriverManager.getConnection(url, id, pwd);
			System.out.println("db 연결 성공(기본 생성자)");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

	public JDBConnect(String _driver, String _url, String _id, String _pwd) {

		try {
			Class.forName(_driver);

			conn = DriverManager.getConnection(_url, _id, _pwd);
			System.out.println("db 연결 성공(인수 생성자)");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

	public JDBConnect(ServletContext _application) {

		try {
			String driver = _application.getInitParameter("OracleDriver");

			Class.forName(driver);

			String url = _application.getInitParameter("OracleUrl");
			String id = _application.getInitParameter("OracleId");
			String pwd = _application.getInitParameter("OraclePwd");

			conn = DriverManager.getConnection(url, id, pwd);

			System.out.println("db 연결 성공(인수 생성자2)");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
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

			System.out.println("JDBC 자원 해제");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
