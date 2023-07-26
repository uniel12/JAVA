package delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDAO {
	
	public int delete(MemberDTO dto) {
		Connection conn = null; // 전역변수로 사용해서 자원반납
		PreparedStatement psmt = null;
		int cnt = 0;
		try {
			
			// 1. 동적로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. DB 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "service";
			String db_pw = "12345";

			conn = DriverManager.getConnection(url, db_id, db_pw);

			// 3. SQL문 준비
			String sql = "delete from member where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());

			cnt = psmt.executeUpdate(); // 영향을 받은 행이 있는지
			// 삭제구문을 통해 삭제가 된 행이 있는지 없는지에 대해서 int결과값을 받아온다.

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("DB 연결실패");
	
			e.printStackTrace();

		} finally {
			try {
				if (psmt != null)
				psmt.close();
				if (conn != null)
				conn.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			

		}
		return cnt;
	}

}
