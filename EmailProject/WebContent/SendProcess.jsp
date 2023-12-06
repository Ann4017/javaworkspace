<%@page import="java.io.FileReader"%>
<%@page import="smtp.NaverSMTP"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	// 폼값(이메일 내용) 저장
	Map<String, String> email_info = new HashMap<String, String>();
	email_info.put("from", request.getParameter("from")); // 보내는 이
	email_info.put("to", request.getParameter("to")); // 받는 이
	email_info.put("subject", request.getParameter("subject")); // 제목

	// 내용은 메일 포맷에 따라 다르게 처리
	String content = request.getParameter("content"); // 내용
	String format = request.getParameter("format"); // 메일 포맷 (text or html)
	if (format.equals("text")) {
		// 텍스트 포맷일 때는 그대로 저장
		email_info.put("content", content);
		email_info.put("format", "text/html;charset=UTF-8");
	} else if (format.equals("html")) {
		// html 포맷일 때는 html 형태로 변환 후 저장
		content = content.replace("\r\n", "<br>"); // 줄바꿈을 html 형태로 수정
		String html_content = ""; // html용으로 변환된 내용을 담을 변수 

		try {
			// html 메일용 템플릿 파일 읽기
			String template_path = application.getRealPath("./MailForm.html");
			BufferedReader br = new BufferedReader(new FileReader(template_path));

			// 한 줄씩 읽어 html_content 변수에 저장
			String one_line;
			while ((one_line = br.readLine()) != null) {
				html_content += one_line + "\n";
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 템플릿의 "__content__ 부분을 메일 내용 대체 (변환 완료)
		html_content = html_content.replace("__CONTENT__", content);
		// 변환된 내용을 저장
		email_info.put("content", html_content);
		email_info.put("format", "text/html;charset=UTF-8");

	}

	try {
		NaverSMTP smtp_server = new NaverSMTP(); // 메일 전송 클래스 생성
		smtp_server.email_sending(email_info); // 전송
		out.print("이메일 전송 성공");
	} catch (Exception e) {
		out.print("이메일 전송 실패");
		e.printStackTrace();
	}
%>