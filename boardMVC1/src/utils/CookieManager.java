package utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieManager {

	public static void make_cookie(String _c_name, String _c_value, int _c_time, HttpServletResponse _resp) {
		Cookie cookie = new Cookie(_c_name, _c_value);
		cookie.setPath("/");
		cookie.setMaxAge(_c_time);
		_resp.addCookie(cookie);
	}

	public static void delete_cookie(String _c_name, HttpServletResponse _resp) {
		make_cookie(_c_name, "", 0, _resp);
	}

	public static String read_cookie(HttpServletRequest _req, String _c_name) {
		String cookie_value = "";
		Cookie[] cookies = _req.getCookies();
		if (cookies != null) {
			for (Cookie c : cookies) {
				String cookie_name = c.getName();
				if (_c_name.equals(cookie_name)) {
					cookie_value = c.getValue();
				}
			}
		}
		return cookie_value;
	}

}
