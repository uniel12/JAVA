package model;

public class MbDTO {

	// 테이블 명 : Member
	// 컬럼
	// 1. 아이디  : String mb_id : varchar2(50)
	// 2. 비밀번호 : String mb_pw : varchar2(50)
	// 3. 등번호 : int backnum : number
	
	private String mb_id;
	private String mb_pw;


	// 생성자 메소드
	public MbDTO(String mb_id, String mb_pw) {
		super();
		this.mb_id = mb_id;
		this.mb_pw = mb_pw;

	}
	// getter / setter 
	public String getMb_id() {
		return mb_id;
	}

	public void setMb_id(String mb_id) {
		this.mb_id = mb_id;
	}

	public String getMb_pw() {
		return mb_pw;
	}

	public void setMb_pw(String mb_pw) {
		this.mb_pw = mb_pw;
	}

	

	

	
}
