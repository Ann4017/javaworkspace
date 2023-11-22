package model2.mvcboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mvcboard/view.do")
public class ViewController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest _req, HttpServletResponse _resp) throws ServletException, IOException {
		String idx = _req.getParameter("idx");
		MVCBoardDAO dao = new MVCBoardDAO();
		MVCBoardDTO dto = new MVCBoardDTO();

		dao.update_visit_count(idx);
		dto = dao.select_view(idx);

		dao.close();

		dto.setContent(dto.getContent().replaceAll("\r\n", "<br>"));

		_req.setAttribute("dto", dto);
		_req.getRequestDispatcher("../View.jsp").forward(_req, _resp);
		;
	}

}
