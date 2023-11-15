<%@page import="fileupload.MyfileDAO"%>
<%@page import="fileupload.MyflieDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page import="java.util.*"%>
<%@ page import="java.text.*"%>
<%@ page import="java.io.*"%>
<%
	//  C:\Users\abh\work\javaworkspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\FileUpload\
	// 	System.out.print(application.getRealPath("/Upload"));
	String save_directory = application.getRealPath("/Upload");
	int max_post_size = 1024 * 1000;
	String encoding = "utf-8";

	// MultipartRequest 객체 생성
	MultipartRequest mr = new MultipartRequest(request, save_directory, max_post_size, encoding);
	String file_name = mr.getFilesystemName("attachedFile");
	String ext = file_name.substring(file_name.lastIndexOf("."));
	String now = new SimpleDateFormat("yyyyMMdd_HmsS").format(new Date());
	String new_file_name = now + ext; // 예) 20231114_172232.txt
	
	// 파일명 변경
	File old_file = new File(save_directory + File.separator + file_name);
	File new_file = new File(save_directory + File.separator + new_file_name);
	old_file.renameTo(new_file);
	
	//
	String name = mr.getParameter("name");
	String title = mr.getParameter("title");
	String[] cate_arr = mr.getParameterValues("cate");
	
	StringBuffer cate_buf = new StringBuffer();
	
	if (cate_arr == null) {
		cate_buf.append("선택 없음");
	} else {
		for(String s : cate_arr) {
			cate_buf.append(s + ", ");
		}
	}
	
	//
	MyflieDTO dto = new MyflieDTO();
	dto.setName(name);
	dto.setTitle(title);
	dto.setCate(cate_buf.toString());
	dto.setOfile(file_name);
	dto.setSfile(new_file_name);
	
	MyfileDAO dao = new MyfileDAO();
	dao.insert_file(dto);
	dao.close();
	
	response.sendRedirect("FileList.jsp");
%>