package 조건문;

import java.util.Scanner;

public class Ex09switch3 {

	public static void main(String[] args) {
		// 예제3
		
		Scanner sc = new Scanner(System.in);
		System.out.print("user1 : ");
		String user1 = sc.next();
		System.out.print("user2 : ");
		String user2 = sc.next();
		
		System.out.print(user1 +">>");
		String A = sc.next();
		System.out.print(user2 +">>");
		String B = sc.next();  
				
		String C = A + B;
		switch (C) { 
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
