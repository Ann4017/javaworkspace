package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.one")
public class FrontController extends HttpServlet {

	protected void doGet(HttpServletRequest _req, HttpServletResponse _resp) throws ServletException, IOException {
		String uri = _req.getRequestURI();
		int last_slash = uri.lastIndexOf("/");
		String command_str = uri.substring(last_slash);

		if (command_str.equals("/regist.one")) {
			regist_func(_req);
		} else if (command_str.equals("/login.one")) {
			login_func(_req);
		} else if (command_str.equals("/freeboard.one")) {
			freeboard_func(_req);
		}

		_req.setAttribute("uri", uri);
		_req.setAttribute("commandStr", command_str);

		_req.getRequestDispatcher("./FrontController.jsp").forward(_req, _resp);

	}

	void regist_func(HttpServletRequest _req) {
		_req.setAttribute("resultValue", "<h4>회원가입</h4>");
	}

	void login_func(HttpServletRequest _req) {
		_req.setAttribute("resultValue", "<h4>로그인</h4>");
	}

	void freeboard_func(HttpServletRequest _req) {
		_req.setAttribute("resultValue", "<h4>자유게시판</h4>");
	}

}
