package SelectAll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String data ="";

	public String selectAll(MemberDTO dto) {
		try {
			// 1. 동적로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. DB연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "service";
			String db_pw ="12345";
			
			conn =DriverManager.getConnection(url,db_id,db_pw);
			// 3. SQL문 작성 및 전송
			// 작성
			String sql = "SELECT * FROM MEMBER";
			psmt= conn.prepareStatement(sql);
			//실행
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				String id  = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);
				
				data = data+ id +"\t" + pw +"\t"+name +"\t"+age+"\n";
				}
			
		
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			// 4. 자원 닫기
				try {
					if(rs != null)
					rs.close();
					if(psmt != null)
						psmt.close();
					if(conn != null)
						conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return data;
		
	}

}
