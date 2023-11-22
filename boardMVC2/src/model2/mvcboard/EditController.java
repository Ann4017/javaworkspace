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
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;

import fileupload.FileUtil;
import utils.JSFunction;

@WebServlet("/mvcboard/edit.do")
public class EditController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest _req, HttpServletResponse _resp) throws ServletException, IOException {

		String idx = _req.getParameter("idx");
		MVCBoardDAO dao = new MVCBoardDAO();
		MVCBoardDTO dto = new MVCBoardDTO();

		dto = dao.select_view(idx);
		_req.setAttribute("dto", dto);
		_req.getRequestDispatcher("/Edit.jsp").forward(_req, _resp);
	}

	@Override
	protected void doPost(HttpServletRequest _req, HttpServletResponse _resp) throws ServletException, IOException {
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

		// 2. 파일 이외의 정보
		String idx = mr.getParameter("idx");
		String prev_ofile = mr.getParameter("prev_ofile");
		String prev_sfile = mr.getParameter("prev_sfile");

		String name = mr.getParameter("name");
		String title = mr.getParameter("title");
		String content = mr.getParameter("content");

		MVCBoardDTO dto = new MVCBoardDTO();
		HttpSession session = _req.getSession();

		String pass = (String) session.getAttribute("pass");

		dto.setIdx(idx);
		dto.setName(name);
		dto.setTitle(title);
		dto.setContent(content);
		dto.setPass(pass);

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

			FileUtil.delete_file(_req, "/Uploads", prev_sfile);

		} else {
			dto.setOfile(prev_ofile);
			dto.setSfile(prev_sfile);
		}

		MVCBoardDAO dao = new MVCBoardDAO();
		int result = dao.update_post(dto);
		dao.close();

		if (result > 0) {
			session.removeAttribute("pass");
			_resp.sendRedirect("./view.do?idx=" + idx);
		} else {
			JSFunction.alert_location("비밀번호 검증을 다시 진행 해주세요.", "./view.do?idx=" + idx, _resp);
		}
	}

}
