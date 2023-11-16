package utils;

public class BoardPage {

	public static String pageing_str(int _total_cnt, int _page_size, int _block_page, int _page_num, String _req_url) {

		String pageing_str = "";
		int total_pages = (int) Math.ceil((double) _total_cnt / _page_size);
		int page_temp = ((_page_num - 1) / _block_page) * _block_page + 1;

		// 이전 페이지 이동
		if (page_temp != 1) {
			pageing_str += "<a href='" + _req_url + "?page_num=1'>[<<]</a>";
			pageing_str += "&nbsp;";
			pageing_str += "<a href='" + _req_url + "?page_num=" + (_page_num - 1) + "'>[<]</a>";
		}

		// 각 페이지 표시
		int block_cnt = 1;

		while (block_cnt <= _block_page && page_temp <= total_pages) {
			if (page_temp == _page_num) {
				pageing_str += "&nbsp;[" + page_temp + "]&nbsp;";
			} else {
				pageing_str += "&nbsp;<a href='" + _req_url + "?page_num=" + page_temp + "'>[" + page_temp
						+ "]</a>&nbsp;";
			}

			page_temp++;
			block_cnt++;
		}

		// 다음 페이지 이동
		if (page_temp <= total_pages) {
			pageing_str += "<a href='" + _req_url + "?page_num=" + page_temp + "'>[>]</a>";
			pageing_str += "&nbsp;";
			pageing_str += "<a href='" + _req_url + "?page_num=" + total_pages + "'>[>>]</a>";
		}

		return pageing_str;
	}

}
