package model2.mvcboard;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import common.ConnectionPool;

public class MVCBoardDAO extends ConnectionPool {

	// 검색 조건에 맞는 게시물의 개수를 반환합니다.
	public int select_count(Map<String, Object> _map) {

		int total_cnt = 0;
		String query = "select count(*) from mvcboard";
		if (_map.get("search_word") != null) {
			query += " where " + _map.get("search_field") + " like '%" + _map.get("search_word") + "%'";
		}

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			if (rs.next()) {
				total_cnt = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return total_cnt;
	}

	// 검색 조건에 맞는 게시물 목록을 반환합니다.(페이징 기능 지원)
	public ArrayList<MVCBoardDTO> select_list_page(Map<String, Object> _map) {

		ArrayList<MVCBoardDTO> list = new ArrayList<MVCBoardDTO>();

		String query = "select * FROM (select rownum rnum, tb.* from (select * from mvcboard";

		if (_map.get("search_word") != null) {
			query += " where " + _map.get("search_field") + " like '%" + _map.get("search_word") + "%'";
		}

		query += " order by idx desc) tb) where rnum BETWEEN ? and ?";

		try {

			psmt = conn.prepareStatement(query);
			psmt.setString(1, _map.get("start").toString());
			psmt.setString(2, _map.get("end").toString());

			rs = psmt.executeQuery();

			while (rs.next()) {
				MVCBoardDTO dto = new MVCBoardDTO();
				dto.setIdx(rs.getString("idx"));
				dto.setName(rs.getString("name"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setPostdate(rs.getDate("postdate"));
				dto.setOfile(rs.getString("ofile"));
				dto.setSfile(rs.getString("sfile"));
				dto.setDowncount(rs.getInt("downcount"));
				dto.setPass(rs.getString("pass"));
				dto.setVisitcount(rs.getInt("visitcount"));

				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	// 게시글 데이터를 받아 DB에 추가합니다(파일 업로드 지원)

	// 주어진 일련번호에 해당하는 게시물을 DTO에 담아 반환합니다.

	// 주어진 일련번호에 해당하는 게시물의 조회수를 1 증가시킵니다.

	// 다운로드 횟수를 1 증가시킵니다.

}
