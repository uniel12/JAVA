package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex03Update {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement psmt = null;
		int cnt = 0;

		System.out.print("ID를 입력해주세요 >>  ");
		String id = sc.next();
		System.out.print("PW를 입력해주세요 >> ");
		String pw = sc.next();
		System.out.print("변경할 Name을 입력해주세요 >> ");
		String name = sc.next();

		// 사용자가 입력한 ID,PW와 일치하는 NAME의 값을 변경하자
		// Update 테이블명 set 열 ='변경할 값' where 조건

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

			psmt.setString(1, name);
			psmt.setString(2, id);
			psmt.setString(3, pw);

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

		if (cnt > 0) {
			System.out.println("회원 정보 업데이트 완료!!");
		} else {
			System.out.println("회원 정보 업데이트 실패..");
		}

		sc.close();
	}

}
