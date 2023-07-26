package insert;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		System.out.print("NAME : ");
		String name = sc.next();
		System.out.print("AGE : ");
		int age = sc.nextInt();

		// id, pw, name, age를 하나의 자료형으로 묶어주자
		// : MemberDTO
		MemberDTO dto = new MemberDTO(id, pw, name, age);
		// dto는 insert되어야하는 데이터

		// controller에 있는 insert에다가 dto를 전송(전달)
		// 1. Controller 객체 생성
		Controller con = new Controller();
		con.insert(dto);

		sc.close();
	}

}
