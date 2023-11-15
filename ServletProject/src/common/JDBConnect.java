package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletContext;

public class JDBConnect {

	// DB���� �� ������ ���࿡ �ʿ��� �ʼ� ��ü
	public static Connection conn; // ������ ���̽� ����
	public static Statement stmt; // CRUD ���� ���� ���� (������ �����͸� ����Ͽ� ������ ����)
	public static PreparedStatement psmt; // CRUD ���� ���� ���� (������ �����͸� ����Ͽ� ������ ����)
	public static ResultSet rs; // select ������ ���� ����� �޾��ִ� ����

	public JDBConnect() {

		try {
			Class.forName("oracle.jdbc.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "musthave";
			String pwd = "1234";

			conn = DriverManager.getConnection(url, id, pwd);
			System.out.println("db ���� ����(�⺻ ������)");

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
			System.out.println("db ���� ����(�μ� ������)");

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

			System.out.println("db ���� ����(�μ� ������2)");

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

			System.out.println("JDBC �ڿ� ����");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
