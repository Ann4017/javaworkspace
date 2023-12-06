package member;

import java.sql.SQLException;

import common.DBConnection;

public class MemberDAO extends DBConnection {

	public int insert_user_info(MemberDTO _dto) {
		int result = 0;
		String query = "INSERT INTO user_info (id, pass, name, email, comment) VALUES (?, ?, ?, ?, ?)";

		try {
			psmt = conn.prepareStatement(query);
			psmt.setString(1, _dto.getId());
			psmt.setString(2, _dto.getPass());
			psmt.setString(3, _dto.getName());
			psmt.setString(4, _dto.getEmail());
			psmt.setString(5, _dto.getComment());

			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}
}
