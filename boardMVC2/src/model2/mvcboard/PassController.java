package model2.mvcboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fileupload.FileUtil;
import utils.JSFunction;

@WebServlet("/mvcboard/pass.do")
public class PassController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest _req, HttpServletResponse _resp) throws ServletException, IOException {
		_req.setAttribute("mode", _req.getParameter("mode"));
		_req.getRequestDispatcher("/Pass.jsp").forward(_req, _resp);
		;
	}

	@Override
	protected void doPost(HttpServletRequest _req, HttpServletResponse _resp) throws ServletException, IOException {

		_resp.setContentType("text/html; charset=UTF-8");

		String idx = _req.getParameter("idx");
		String mode = _req.getParameter("mode");
		String pass = _req.getParameter("pass");

		MVCBoardDAO dao = new MVCBoardDAO();
		MVCBoardDTO dto = new MVCBoardDTO();

		boolean confirmed = dao.confirm_paasword(pass, idx);
		dao.close();

		if (confirmed) {
			if (mode.equals("edit")) {
				HttpSession session = _req.getSession();
				session.setAttribute("pass", pass);
				_resp.sendRedirect("./edit.do?idx=" + idx);
			} else if (mode.equals("delete")) {
				dto = dao.select_view(idx);
				int result = dao.delete_post(idx);
				dao.close();

				if (result > 0) {
					String save_file_name = dto.getSfile();
					FileUtil.delete_file(_req, "/Uploads", save_file_name);
				}
				JSFunction.alert_location("삭제 완료", "./list.do", _resp);
			}
		} else {
			JSFunction.alert_back("비밀번호가 일치하지 않습니다.", _resp);
		}
	}

}
