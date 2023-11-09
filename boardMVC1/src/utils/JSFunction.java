package utils;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;

public class JSFunction {

	public static void alert_location(String _msg, String _url, JspWriter out) {
		String script = "<script>" + "alert('" + _msg + "'); " + "location.href='" + _url + "'" + "</script>";

		try {
			out.print(script);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void alert_back(String _msg, JspWriter out) {
		String script = "<script>" + "alert('" + _msg + "'); " + "history.back()" + "</script>";

		try {
			out.print(script);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
