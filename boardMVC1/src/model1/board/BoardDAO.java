package model1.board;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.ServletContext;

import common.JDBConnect;

public class BoardDAO extends JDBConnect {

	public BoardDAO(ServletContext _application) {
		super(_application);
	}

	// �˻� ���ǿ� �´� �Խù��� ���� ��ȯ
	public int select_count(Map<String, Object> map) {
		int total_cnt = 0;
		String query = "select count(*) from board";
		if (map.get("search_word") != null) {
			query += " where " + map.get("search_field") + " like '%" + map.get("search_word") + "%'";
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

	// �˻� ���ǿ� �´� �Խù� ��� ��ȯ
	public ArrayList<BoardDTO> select_list(Map<String, Object> map) {
		// 1. ��ȸ �� ������� ������ ���� ����
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
		// 2. �������� �ۼ��ؼ� ������ ����
		String query = "select * from board";
		if (map.get("search_word") != null) {
			query += " where " + map.get("search_field") + " like '%" + map.get("search_word") + "%'";
		}
		query += " order by num desc";

		try {
			// 3. DB connect ��ü ����
			// 4. ������ ������ ���� ��ü�� ����
			stmt = conn.createStatement();
			// 5. ������ ���� �� ResultSet ��ü�� ����
			rs = stmt.executeQuery(query);
			// 6. ����� ������ ���� (BoardDTO ����)
			while (rs.next()) {
				BoardDTO dto = new BoardDTO();
				dto.setNum(rs.getString("num"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setId(rs.getString("id"));
				dto.setPostdate(rs.getDate("postdate"));
				dto.setVisitcount(rs.getString("visitcount"));

				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 7. DB ���� ����
		close();

		return list;
	}

	public ArrayList<BoardDTO> select_list_page(Map<String, Object> map) {

		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();

		String query = "select * FROM (select rownum rnum, tb.* from (select * from board";

		if (map.get("search_word") != null) {
			query += " where " + map.get("search_field") + " like '%" + map.get("search_word") + "%'";
		}

		query += " order by num desc) tb) where rnum BETWEEN ? and ?";

		try {

			psmt = conn.prepareStatement(query);
			psmt.setString(1, map.get("start").toString());
			psmt.setString(2, map.get("end").toString());

			rs = psmt.executeQuery();

			while (rs.next()) {
				BoardDTO dto = new BoardDTO();

				dto.setNum(rs.getString("num"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setId(rs.getString("id"));
				dto.setPostdate(rs.getDate("postdate"));
				dto.setVisitcount(rs.getString("visitcount"));

				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	public int insert_write(BoardDTO dto) {
		int result = 0;
		String query = "insert into board (num, title, content, id, visitcount) values (seq_board_num.nextval, ?, ?, ?, 0)";

		try {
			psmt = conn.prepareStatement(query);
			psmt.setString(1, dto.getTitle());
			psmt.setString(2, dto.getContent());
			psmt.setString(3, dto.getId());

			result = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;

	}

	public void update_visitcount(String _num) {
		String query = "update board set visitcount = visitcount + 1 where num = ?";

		try {
			psmt = conn.prepareStatement(query);
			psmt.setString(1, _num);
			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public BoardDTO select_view(String _num) {
		BoardDTO dto = new BoardDTO();

		String query = "select B.*, M.name from member M inner join board B on M.id = B.id where num = ?";

		try {
			psmt = conn.prepareStatement(query);
			psmt.setString(1, _num);
			rs = psmt.executeQuery();

			if (rs.next()) {
				dto.setNum(rs.getString("num"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setPostdate(rs.getDate("postdate"));
				dto.setId(rs.getString("id"));
				dto.setVisitcount(rs.getString("visitcount"));
				dto.setName(rs.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return dto;
	}

	public int update_edit(BoardDTO _dto) {
		int result = 0;
		String query = "update board set title = ?, content = ? where num = ?";

		try {
			psmt = conn.prepareStatement(query);
			psmt.setString(1, _dto.getTitle());
			psmt.setString(2, _dto.getContent());
			psmt.setString(3, _dto.getNum());

			result = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	public int delete_post(BoardDTO _dto) {
		String query = "delete from board where num = ?";
		int result = 0;

		try {
			psmt = conn.prepareStatement(query);
			psmt.setString(1, _dto.getNum());

			result = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}
}
