package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex02Delete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Connection conn = null; // 전역변수로 사용해서 자원반납
		PreparedStatement psmt = null;
		int cnt = 0;

		System.out.print("삭제할 ID를 입력해주세요 >> ");
		String id = sc.next();
		System.out.print("비밀번호를 확인하겠습니다 >> ");
		String pw = sc.next();

		// 사용자가 입력한 ID와 PW가 일치하는 데이터 행을 삭제해주세요
		// delete
		// where from member id =? and pw=?

		// 1. 동적로딩
		// 2. 연결권한 확인하기 (준비물 3개 필요)
		// 3. SQL문 준비하기
		// 4. executeUpdate(); : 영향을 받은 행이 있는지 없는지에 대한 결과값 받아오기
		// 5. 결과값 처리하기
		// 6. 자원 반납하기 (자원 반납은 역순으로 진행)

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
			psmt.setString(1, id);
			psmt.setString(2, pw);

			cnt = psmt.executeUpdate(); // 영향을 받은 행이 있는지
			// 삭제구문을 통해 삭제가 된 행이 있는지 없는지에 대해서 int결과값을 받아온다.

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("DB 연결실패");
			// - ojdbc11.jar 경로
			// - OracleDriver 클래스
			// - 오타가 아닌지...
			e.printStackTrace();

		} finally {
			// 사용을 했는지 안했는지 판단
			// 사용을 했으면 반납 ---> 역순으로 반납

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

		if (cnt > 0) {
			System.out.println("회원 정보 삭제 완료!!");
		} else {
			System.out.println("회원 정보 삭제 실패..");
		}

		sc.close();

	}

}
