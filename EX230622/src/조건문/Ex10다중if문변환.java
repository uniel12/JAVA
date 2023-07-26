package 조건문;

import java.util.Scanner;

public class Ex10다중if문변환 {

	public static void main(String[] args) {
		// 예제3 가위바위보

		// user1, user2 이름 입력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("USER1 : ");
		String user1 = sc.next();
		System.out.print("USER2 : ");
		String user2 = sc.next();
		// user1, user2가 낸 가위 바위 보 입력받기(rsp1, rsp2)
		System.out.print(user1 + ">>");
		String rsp1 = sc.next();
		System.out.print(user2 + ">>");
		String rsp2 = sc.next();

		
		if (rsp1.equals(rsp2)) {
			System.out.println("무승부!!");
		} else if (rsp1.equals("가위")) {
			if (rsp2.equals("바위")) {
				System.out.println(user2 + "님 승리!");
			} else {
				System.out.println(user1 + "님 승리!");
			}

		} else if (rsp1.equals("바위")) {
			if (rsp2.equals("보")) {
				System.out.println(user2 + "님 승리!");
			} else if (rsp2.equals("가위")) {
				System.out.println(user1 + "님 승리!");
			}

		} else if (rsp1.equals("보")) {
			if (rsp2.equals("가위")) {
				System.out.println(user2 + "님 승리!");
			} else if (rsp2.equals(rsp2)) {
				System.out.println(user1 + "님 승리!");
			}

		} else {
			System.out.println("잘못 입력하셨습니다.");

			sc.close();

		}

	}
}
