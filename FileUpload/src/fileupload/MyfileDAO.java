package fileupload;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.ConnectionPool;

public class MyfileDAO extends ConnectionPool {

	// 새로운 게시물 입력
	public int insert_file(MyflieDTO dto) {
		int result = 0;
		String query = "insert into myfile (idx, name, title, cate, ofile, sfile) values (seq_board_num.nextval, ?, ?, ?, ?, ?)";

		try {
			psmt = conn.prepareStatement(query);

			psmt.setString(1, dto.getName());
			psmt.setString(2, dto.getTitle());
			psmt.setString(3, dto.getCate());
			psmt.setString(4, dto.getOfile());
			psmt.setString(5, dto.getSfile());

			psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	// 파일 목록 반환
	public List<MyflieDTO> my_file_list() {
		String query = "select * from myfile order by idx desc";
		List<MyflieDTO> file_list = new ArrayList<MyflieDTO>();

		try {
			psmt = conn.prepareStatement(query);

			rs = psmt.executeQuery();

			while (rs.next()) {
				MyflieDTO dto = new MyflieDTO();
				dto.setIdx(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setTitle(rs.getString(3));
				dto.setCate(rs.getString(4));
				dto.setOfile(rs.getString(5));
				dto.setSfile(rs.getString(6));
				dto.setPostdate(rs.getString(7));

				file_list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return file_list;
	}
}
