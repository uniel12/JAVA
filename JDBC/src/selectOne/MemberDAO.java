package selectOne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MemberDAO {

	public  String select(MemberDTO dto) {
	
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String data = "";
		

		try {
			// 1. 동적로딩 -> Oracle Driver클래스 찾기
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. DB 연결
			// url, db_id, db_pw
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "service";
			String db_pw = "12345";
			
			conn = DriverManager.getConnection(url,db_id,db_pw);
			
			// 3. SQL문 작성 및 전송
			String sql = "select * from member where id = ? and pw = ? ";
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1,dto.getId());
			psmt.setString(2,dto.getPw());
			
			// select는 insert, update, delete와는 달리 DB에서 조회한 결과를 반환
			// ResultSet -> 커서객체
			rs = psmt.executeQuery();
//			System.out.println(rs.next());
			// 커서를 내림 
			if(rs.next()) {
				// 로그인 성공! -> name님 환영합니다.
				String name = rs.getString(3);
//				rs.getString("NAME");
//				System.out.println(name +"님 환영합니다!");
				data += name;
			}
//			else {
				// 로그인 실패! 출력
//				System.out.println("로그인 실패!");
//			}
//			
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 찾기 실패!");
		} catch (SQLException e) {
			System.out.println("SOL오류!");
		}finally {
		// 4. 통로 닫기, 자원 반납
			try {
				rs.close();
				psmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return data;
	}
	
}
