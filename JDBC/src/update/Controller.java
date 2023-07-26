package update;


public class Controller {
	public void updateCon(MemberDTO dto) {
		// 1. 틀만
		int cnt = new MemberDAO().update(dto);
		
		if (cnt > 0) {
			System.out.println("회원 정보 업데이트 완료!!");
		} else {
			System.out.println("회원 정보 업데이트 실패..");
		}
	}
}
