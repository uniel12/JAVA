package update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDAO {

	public int update(MemberDTO dto) {
		
		Connection conn = null; // 통로 닫아주는데 쓰기 위해서 전역변수로 선언해줌
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

			// 3. SQL문 작성 및 전송(PreparedStatement 객체)
			// Update
			String sql = "Update member SET name = ? where id =? and pw =?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getName());
			psmt.setString(2, dto.getId());
			psmt.setString(3, dto.getPw());

			cnt = psmt.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("DB 연결실패");
			e.printStackTrace();
			
		} finally {
			// 4. 통로 닫아주기
			try {
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				System.out.println("자원반납 오류");
				e.printStackTrace();
			}

		}
		return cnt;
	
	}
}
