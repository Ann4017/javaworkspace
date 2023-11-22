package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import modal.MemberDTO;

@WebServlet("/ex02Gson")
public class Ex02Gson extends HttpServlet {

	@Override
	protected void service(HttpServletRequest _req, HttpServletResponse _resp) throws ServletException, IOException {

		_resp.setContentType("text/html; charset=utf-8");

		MemberDTO member1 = new MemberDTO("email1", "01011112222", "서울 강남");
		MemberDTO member2 = new MemberDTO("email2", "01022223333", "서울 강북");
		MemberDTO member3 = new MemberDTO("email3", "01044445555", "서울 강동");
		MemberDTO member4 = new MemberDTO("email4", "01066667777", "서울 강서");

		List<MemberDTO> list = new ArrayList<MemberDTO>();
		list.add(member1);
		list.add(member2);
		list.add(member3);
		list.add(member4);

		Gson gson = new Gson();
		PrintWriter out = _resp.getWriter();

		String json = gson.toJson(list);
		out.print(json);
	}

}
