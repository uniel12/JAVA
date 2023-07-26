package while문;

import java.util.Scanner;

public class Ex07실습7 {

	public static void main(String[] args) {
		// 로그인 프로그램
		// 아이디 : Hello 비밀번호 : 1234
		Scanner sc = new Scanner(System.in);
		String id = "Hello";
		String pw = "1234";
		// .equals ("문자열"
		while (true) {
			// 아이디, 비밀번호 입력받기
			System.out.print("아이디를 입력해주세요>> ");
			String input_id = sc.next();
			System.out.print("비밀번호를 입력해주세요>> ");
			String input_pw = sc.next();

			// 로그인 성공시 " 로그인 성공!" 출력후 반복문 탈출
			if (id.equals(input_id) && pw.equals(input_pw)) {
				System.out.println("로그인 성공!");
				break;
				// 로그인 실패시 " 아이디와 비밀번호가 잘못되었습니다." 출력
			} else {
				System.out.println("아이디와 비밀번호가 잘못되었습니다.");
			}

		}

		sc.close();
	}

}
