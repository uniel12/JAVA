package re20230630;

import java.util.Scanner;

public class Ex02로그인프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		
		
		while (true) {
			System.out.print("ID : ");
			String id = sc.next();
			System.out.print("PW : ");
			String pw = sc.next();

			if (id.equals("user") && pw.equals("pass")) {
				System.out.println("로그인 성공!");
				System.out.println("프로그램 종료");
				break;
			} else {
				count++;
				System.out.println("로그인 실패!");
				if(count==3) {
					System.out.println("본인인증을 해주세요");
					break;
				}
			
				
				System.out.println("계속하시겠습니까?(Y/N)");
				String yesno =sc.next();
				if (yesno.equals("Y") || yesno.equals("y")) {
					continue;
				}else if(yesno.equals("N") || yesno.equals("n")) {
					break;
				}else {
					System.out.println("잘못입력하셨습니다.");
					System.out.println("계속하시겠습니까?(Y/N)");
				
					
				}

			}

		}
		sc.close();
	}
}
