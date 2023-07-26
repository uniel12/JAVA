package SelectAll;

public class Controller {

	public void selectAll(MemberDTO dto) {
		MemberDAO dao = new MemberDAO();
		String data =dao.selectAll(dto);
		System.out.println(data);
	}

}
