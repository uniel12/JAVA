package selectOne;

public class Controller {

	public void selectCon(MemberDTO dto) {
		
		String data = new MemberDAO().select(dto);
		
//		while(rs.next()) {
//			rs.getString(1)
//			rs.getString(2)
//			rs.getString(3)
//			rs.getString(4)
//		}
		
		if(data.equals("")) {
			System.out.println("로그인 실패!");
		}else {
		
		System.out.println(data +"님 환영합니다!");
		}
	}

	
}
