package 조건문;

import java.util.Scanner;

public class Ex09switch3답 {

	public static void main(String[] args) {
		// 예제3
		// 가위바위보 게임
		// user1과 user2의 이름을 입력받아 가위바위보게임
		
		Scanner sc = new Scanner(System.in);
		System.out.print("USER1 : ");
		String user1 = sc.next();
		System.out.print("USER2 : ");
		String user2 = sc.next();
		//user1, user2가 낸 가위 바위 보 입력받기(rsp1, rsp2)	
		System.out.print(user1 +">>");
		String rsp1 = sc.next();
		System.out.print(user2 +">>");
		String rsp2 = sc.next();
		
		//rsp1과 rsp2를 붙여주기
		
		String rsp = rsp1 + rsp2;
				
	
		
		switch(rsp) {
		
		case "가위보","바위가위","보바위" :
			System.out.println(user1 + "님 승리!");
			break;
		case "보가위","가위바위", "바위보":
			System.out.println(user2 + "님 승리!");
			break;
		case "가위가위", "보보", "바위바위":
			System.out.println("무승부!!");
			break;
		default:
			System.out.println("잘못 내셨습니다!");
		
		}
		sc.close();

	}

}
