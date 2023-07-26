package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDAO {

	// 데이터 베이스에 데이터를 삽입하는 기능
	public int insert(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement psmt = null;
		int cnt = 0;

		try {
			// 1. 동적로딩 Class.forName();
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. DB 연결(Connection 객체 생성)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "service";
			String db_pw = "12345";

			conn = DriverManager.getConnection(url, db_id, db_pw);

			// 3. SQL문 작성 및 전송
			String sql = "insert into member values(?, ?, ?, ?)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());
			psmt.setInt(4, dto.getAge());

			// 실행 2가지 방법
			// executeUpdate() -> insert, update, delete
			// executeQuery() -> select
			cnt = psmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			System.out.println("동적로딩실패 - OracleDriver클래스를 못찾았습니다~");
		} catch (SQLException e) {
			System.out.println("SQL 오류~");
		} finally {
			// 4. 통로 닫아주기(= 자원 반납하기)
			try {
					psmt.close();
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return cnt;
	}



}
