package SelectAll;

import java.util.Scanner;


public class View {

	public static void main(String[] args) {
		// 만약 내가 관리자라면 전체 회원 조회
				Scanner sc = new Scanner(System.in);
				System.out.print("관리자 ID : ");
				String id = sc.next();
				System.out.print("관리자 PW : ");
				String pw = sc.next();
				MemberDTO dto = new MemberDTO(id, pw);
				
				System.out.println(" MEMBER 전체조회 >> ");
				Controller con = new Controller();
				con.selectAll(dto);
				
				sc.close();

	}

}
