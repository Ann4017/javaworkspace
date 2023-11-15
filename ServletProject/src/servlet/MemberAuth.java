package servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import membership.MemberDAO;
import membership.MemberDTO;

@WebServlet(urlPatterns = "/MemberAuth.mvc", initParams = @WebInitParam(name = "admin_id", value = "nakja"))
public class MemberAuth extends HttpServlet {

	MemberDAO dao;

	@Override
	public void init() throws ServletException {
		System.out.println("init() ȣ��");
		ServletContext application = this.getServletContext();
		String driver = application.getInitParameter("OracleDriver");
		String url = application.getInitParameter("OracleUrl");
		String id = application.getInitParameter("OracleId");
		String pwd = application.getInitParameter("OraclePwd");

		dao = new MemberDAO(driver, url, id, pwd);

	}

	@Override
	protected void service(HttpServletRequest _req, HttpServletResponse _resp) throws ServletException, IOException {
		String admin_id = this.getInitParameter("admin_id");
		String id = _req.getParameter("id");
		String pass = _req.getParameter("pass");

		MemberDTO dto = dao.get_memberDTO(id, pass);

		String name = dto.getName();
		if (name != null) {
			_req.setAttribute("auth_message", name + " ȸ���� ȯ���մϴ�.");
		} else {
			if (admin_id.equals(id)) {
				_req.setAttribute("auth_message", admin_id + " �� �ְ� ������ �Դϴ�.");
			} else {
				_req.setAttribute("auth_message", "���ϴ� ȸ���� �ƴմϴ�.");
			}
		}
		_req.getRequestDispatcher("./MemberAuth.jsp").forward(_req, _resp);
	}

	@Override
	public void destroy() {
		dao.close();
	}

}
