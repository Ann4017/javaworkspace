package model2.mvcboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mvcboard/write.do")

public class WriteController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest _req, HttpServletResponse _resp) throws ServletException, IOException {
		// �� ���� �� ��û
		_req.getRequestDispatcher("/write.jsp").forward(_req, _resp);
	}

	@Override
	protected void doPost(HttpServletRequest _req, HttpServletResponse _resp) throws ServletException, IOException {
		// �� ���� ������ ����
	}

}
