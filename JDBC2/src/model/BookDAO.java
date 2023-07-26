package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class BookDAO {
	// Connection, PreparedStatement, ResultSet을 DAO에서 사용할 수 있도록
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	BookDTO dto = null;
	int cnt = 0;
	String data = "";

	// getCon : DB에 연결권한을 확인하는 메소드(기능)
	public void getCon() {
		try {
			// 1. 동적로딩 Class.forName();
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. DB 연결(Connection 객체 생성)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "service";
			String db_pw = "12345";

			conn = DriverManager.getConnection(url, db_id, db_pw);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	// getClose : DB 자원 반납하는 메소드(기능)
	public void getClose() {

		// select : rs -> psmt -> conn
		// update, delete, insert -> psmt -->conn

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

	// insert
	public int insert(BookDTO dto) {
		// 1. DB연결권한
		getCon();
		// 3. SQL문 작성 및 전송
		String sql = "INSERT INTO book VALUES (?, ?, ?, ?)";
		try {
			// ?
			// dto : : title, name, price, booknum
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getTitle());
			psmt.setString(2, dto.getName());
			psmt.setInt(3, dto.getPrice());
			psmt.setString(4, dto.getBooknum());

			cnt = psmt.executeUpdate(); // 영향을 받은 행이 있는지 없는지 : int

		} catch (SQLException e) {
			System.out.println("SQL 오류~");
		} finally {
			// 자원을 반납
			getClose();
		}
		return cnt;
	}
	
	// selectOne
	public BookDTO selectOne(String title) {
		getCon();
		
		try {
			String sql = "SELECT * FROM book WHERE title = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, title);

			// select는 insert, update, delete와는 달리 DB에서 조회한 결과를 반환
			// ResultSet -> 커서객체
			rs = psmt.executeQuery();

			if (rs.next()) {
				String db_title = rs.getString(1);
				String name = rs.getString(2);
				int price = rs.getInt(3);
				String booknum = rs.getString(4);

				dto = new BookDTO(db_title,name,price,booknum);

			} 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 자원을 반납
			getClose();
		}
		return dto;
	}
	
	// selectAll
	public ArrayList<BookDTO> selectAll() {
		
		getCon();
		ArrayList<BookDTO> list = new ArrayList<BookDTO>();
		try {
			// SQL
			String sql = "SELECT * FROM book";
			psmt = conn.prepareStatement(sql);
			// ?
			// 실행 : Select -> executeQuery();
			rs = psmt.executeQuery();
			// rs.next() : 데이터가 있는지 없는지 t/f
			while (rs.next()) {
				// while문의 동작은 데이터가 있는 동안 동작
				String title = rs.getString(1); // 컬럼 인덱스 : 1부터 시작
				String name = rs.getString("name"); //컬럼명 : 문자열로~
				int price = rs.getInt(3);
				String booknum = rs.getString(4);
				
				dto = new BookDTO(title,name,price,booknum);
				
			list.add(dto);
			
				}
				
		} catch (SQLException e) {
			System.out.println("SOL오류!");
		} finally {
			// 자원을 반납
			getClose();
		}
		return list;
	}
	
	// delete
	public int delete(String booknum) {
		getCon();
		try {
			String sql = "DELETE FROM book WHERE booknum = ? ";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, booknum);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("SOL오류!");
		} finally {
			// 자원을 반납
			getClose();
		}
		return cnt;
	}
	
	// update
	public int update(BookDTO dto) {
		getCon();
		try {
			String sql = "UPDATE book SET booknum = ?, price = ?  WHERE title = ? ";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getBooknum());
			psmt.setInt(2, dto.getPrice());
			psmt.setString(3, dto.getTitle());

			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("SOL오류!");
		} finally {
			// 자원을 반납
			getClose();
		}
		return cnt;
	}

}
