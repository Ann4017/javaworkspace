package membership;

import java.sql.SQLException;

import common.JDBConnect;

public class MemberDAO extends JDBConnect {

	public MemberDAO(String _driver, String _url, String _id, String _pwd) {
		super(_driver, _url, _id, _pwd);
	}

	public MemberDTO get_memberDTO(String _u_id, String _u_pass) {
		MemberDTO dto = new MemberDTO();

		String sql = "select * from member where id = ? and pass = ?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, _u_id);
			psmt.setString(2, _u_pass);
			rs = psmt.executeQuery();

			if (rs.next()) {
				dto.setId(rs.getString("id"));
				dto.setPass(rs.getString("pass"));
				dto.setName(rs.getString("name"));
				dto.setRegidate(rs.getString("regidate"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		close();

		return dto;
	}

	public int insert_memberDTO(MemberJoinDTO mem) {
		String sql = "insert into memberjoin values(mem_no_seq.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, sysdate)";
		int result = 0;

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, mem.getId());
			psmt.setString(2, mem.getPwd());
			psmt.setString(3, mem.getAddr1());
			psmt.setString(4, mem.getAddr2());
			psmt.setString(5, mem.getGender());
			psmt.setString(6, mem.getHobby());
			psmt.setString(7, mem.getPhone1());
			psmt.setString(8, mem.getPhone2());
			psmt.setString(9, mem.getPhone3());
			psmt.setString(10, mem.getJob());
			psmt.setString(11, mem.getContent());

			result = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		close();

		return result;
	}

}
