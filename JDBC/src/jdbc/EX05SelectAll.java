package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EX05SelectAll {

	public static void main(String[] args) {

		// 필요한 객체만 생성하기 -> JDBC에 필요한 자원
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		// 1. 동적 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. DB 연결
			// url, db_id, db_pw
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "service";
			String db_pw = "12345";

			conn = DriverManager.getConnection(url, db_id, db_pw);

			// SQL
			String sql = "select * from member";
			psmt = conn.prepareStatement(sql);
			// ?
			// 실행 : Select -> executeQuery();
			rs = psmt.executeQuery();

			// rs.next() : 데이터가 있는지 없는지 t/f
			while (rs.next()) {
				// while문의 동작은 데이터가 있는 동안 동작
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);
				System.out.println(id + "\t" + pw + "\t" + name + "\t" + age);

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 자원 반납 : 사용한 역순
			// rs -> psmt -> conn
			try {
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}

}
