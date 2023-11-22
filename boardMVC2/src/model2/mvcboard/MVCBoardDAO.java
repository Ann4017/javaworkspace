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
	public int insert_write(MVCBoardDTO _dto) {
		int result = 0;
		String query = "insert into mvcboard (idx, name, title, content, ofile, sfile, pass) values (seq_board_num.nextval, ?, ?, ?, ?, ?, ?)";

		try {
			psmt = conn.prepareStatement(query);
			psmt.setString(1, _dto.getName());
			psmt.setString(2, _dto.getTitle());
			psmt.setString(3, _dto.getContent());
			psmt.setString(4, _dto.getOfile());
			psmt.setString(5, _dto.getSfile());
			psmt.setString(6, _dto.getPass());

			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	// 주어진 일련번호에 해당하는 게시물을 DTO에 담아 반환합니다.
	public MVCBoardDTO select_view(String _idx) {

		MVCBoardDTO dto = new MVCBoardDTO();
		String query = "select * from mvcboard where idx = ?";

		try {
			psmt = conn.prepareStatement(query);

			psmt.setString(1, _idx);
			rs = psmt.executeQuery();

			if (rs.next()) {
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
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;
	}

	// 주어진 일련번호에 해당하는 게시물의 조회수를 1 증가시킵니다.
	public void update_visit_count(String _idx) {

		String query = "update mvcboard set visitcount = visitcount + 1 where idx = ?";

		try {
			psmt = conn.prepareStatement(query);
			psmt.setString(1, _idx);

			psmt.executeUpdate();
		} catch (

		SQLException e) {
			e.printStackTrace();
		}

	}

	// 다운로드 횟수를 1 증가시킵니다.

	// 입력한 비밀번호가 지정한 일련번호의 게시물 비밀번호와 일치하는지 확인 합니다.
	public boolean confirm_paasword(String _pass, String _idx) {

		boolean is_curr = true;

		String query = "select count(*) from mvcboard where pass = ? and idx = ?";

		try {
			psmt = conn.prepareStatement(query);
			psmt.setString(1, _pass);
			psmt.setString(2, _idx);

			rs = psmt.executeQuery();

			rs.next();

			if (rs.getInt(1) == 0) {
				is_curr = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return is_curr;
	}

	// 지정한 일련번호의 게시물을 삭제합니다.
	public int update_post(MVCBoardDTO _dto) {

		int result = 0;
		String query = "update mvcboard set title = ?, name = ?, content = ?, ofile = ?, sfile = ? where idx = ? and pass = ?";

		try {
			psmt = conn.prepareStatement(query);
			psmt.setString(1, _dto.getTitle());
			psmt.setString(2, _dto.getName());
			psmt.setString(3, _dto.getContent());
			psmt.setString(4, _dto.getOfile());
			psmt.setString(5, _dto.getSfile());
			psmt.setString(6, _dto.getIdx());
			psmt.setString(7, _dto.getPass());

			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	public int delete_post(String _idx) {
		int result = 0;
		String query = "delete from mvcboard where idx = ?";

		try {
			psmt = conn.prepareStatement(query);
			psmt.setString(1, _idx);

			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}
}
