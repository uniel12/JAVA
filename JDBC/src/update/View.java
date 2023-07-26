package update;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		
		// MVC 패턴을 사용해서 
		// 사용자한테 아이디, 패스워드 입력받아
		// NAME을 바꾸는 코드를 작성해보자!!
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ID를 입력하세요 >> ");
		String id = sc.next();
		System.out.println("PW를 입력하세요 >> ");
		String pw = sc.next();
		System.out.println("변경할 Name을 입력하세요>> ");
		String name = sc.next();
		
		MemberDTO dto = new MemberDTO(id, pw, name);
		
		// 1. Controller 객체 생성
		Controller con = new Controller();
		
		con.updateCon(dto);
				
				
		sc.close();
			
	}

}
