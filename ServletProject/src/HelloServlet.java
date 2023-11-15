import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Servlet 
// 1. url 요청을 통해서만 실행 가능

// jsp 영역 객체
// page -> pageContext
// request -> HttpServletRequest
// response -> HttpServletResponse
// session -> HttpSession
// application -> ServletContext
public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");

		PrintWriter out = resp.getWriter();
		out.print("<h1>get 방식 Servlet 요청</h1>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

}
