package model2.mvcboard;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

import fileupload.FileUtil;
import utils.JSFunction;

@WebServlet("/mvcboard/write.do")

public class WriteController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest _req, HttpServletResponse _resp) throws ServletException, IOException {
		// 글 쓰기 폼 요청
		_req.getRequestDispatcher("../write.jsp").forward(_req, _resp);
//		_resp.sendRedirect("../write.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest _req, HttpServletResponse _resp) throws ServletException, IOException {
		// 글 쓰기 데이터 저장

		// 1. 파일 업로드 처리
		String save_directory = _req.getServletContext().getRealPath("/Uploads");

		ServletContext application = getServletContext();
		int max_post_size = Integer.parseInt(application.getInitParameter("max_post_size"));

		MultipartRequest mr = FileUtil.upload_file(_req, save_directory, max_post_size);

		if (mr == null) {
			// out 객체
			// JspWriter(jsp) -> PrintWriter(java)
			// PrintWriter out = response.getWriter();

			JSFunction.alert_location("첨부파일이 제한 용량 초과", "./write.jsp", _resp);

			return;
		}

		MVCBoardDTO dto = new MVCBoardDTO();
		dto.setName(mr.getParameter("name"));
		dto.setTitle(mr.getParameter("title"));
		dto.setContent(mr.getParameter("content"));
		dto.setPass(mr.getParameter("pass"));

		String file_name = mr.getFilesystemName("ofile");

		if (file_name != null) {

			String ext = file_name.substring(file_name.lastIndexOf("."));
			String now = new SimpleDateFormat("yyyyMMdd_HmsS").format(new Date());
			String new_file_name = now + ext; // 예) 20231114_172232.txt

			// 파일명 변경
			File old_file = new File(save_directory + File.separator + file_name);
			File new_file = new File(save_directory + File.separator + new_file_name);

			old_file.renameTo(new_file);

			dto.setOfile(file_name);
			dto.setSfile(new_file_name);
		}

		MVCBoardDAO dao = new MVCBoardDAO();
		int result = dao.insert_write(dto);
		dao.close();

		if (result > 0) {
			_resp.sendRedirect("./list.do");
		} else {
			_resp.sendRedirect("./write.do");
		}

	}

}
