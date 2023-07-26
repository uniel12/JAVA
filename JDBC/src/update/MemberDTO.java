package update;

public class MemberDTO {
	// DTO : Data Transfer Object
		// 데이터를 하나의 자료형으로 묶어서 전달하기 위해 사용되는 객체 자료형
		
		// MemberTable에 있는 컬럼의 종류
		// id, pw, name을 초기화하는 생성자 만들기
	
		private String id;
		private String pw;
		private String name;
		
		
		// 생성자 메소드
		public MemberDTO(String id, String pw, String name) {
			this.id = id;
			this.pw = pw;
			this.name = name;
		
		}
		// getter -> Setter 없으면 VO
		public String getId() {
			return id;
		}

		public String getPw() {
			return pw;
		}

	
		public String getName() {
			return name;
		}

	
	
}
