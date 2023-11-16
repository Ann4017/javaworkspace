package model2.mvcboard;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utils.BoardPage;

@WebServlet("/mvcboard/list.do")

public class ListController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest _req, HttpServletResponse _resp) throws ServletException, IOException {

		MVCBoardDAO dao = new MVCBoardDAO();

		String search_field = _req.getParameter("search_field");
		String search_word = _req.getParameter("search_word");

		Map<String, Object> param = new HashMap<>();

		if (search_word != null) {
			param.put("search_field", search_field);
			param.put("search_word", search_word);
		}

		int total_cnt = dao.select_count(param);

		// 페이지 처리 start
		ServletContext application = this.getServletContext();

		int page_size = Integer.parseInt(application.getInitParameter("posts_per_page"));
		int block_size = Integer.parseInt(application.getInitParameter("pages_per_block"));

		// 현재 페이지 확인
		int page_num = 1;
		String page_temp = _req.getParameter("page_num");

		if (page_temp != null && !page_temp.equals("")) {
			page_num = Integer.parseInt(page_temp);
		}

		// 목록에 출력 할 게시물 범위 계산
		int start = (page_num - 1) * page_size + 1;
		int end = page_num * page_size;

		param.put("start", start);
		param.put("end", end);
		ArrayList<MVCBoardDTO> board_lists = dao.select_list_page(param);

		dao.close();

		String pageing = BoardPage.pageing_str(total_cnt, page_size, block_size, page_num, "/mvcboard/list.do");

		param.put("pageing", pageing);
		param.put("total_cnt", total_cnt);
		param.put("page_size", page_size);
		param.put("page_num", page_num);

		_req.setAttribute("board_lists", board_lists);
		_req.setAttribute("params", param);

		_req.getRequestDispatcher("/List.jsp").forward(_req, _resp);

	}

}
