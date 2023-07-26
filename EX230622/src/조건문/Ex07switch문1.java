package 조건문;

import java.util.Scanner;

public class Ex07switch문1 {

	public static void main(String[] args) {
		
		// switch문
		// 조건식이 아닌 식(값)을 비교할 때 사용
		Scanner sc = new Scanner(System.in);
		System.out.println("선풍기 풍속을 조절합니다.\n1번 : 약, 2번 : 중, 3번 : 강");
		System.out.print("선택한 번호 : ");
		int fan = sc.nextInt();
		
		switch(fan) {
		
		case 1: 
			System.out.println("약한 바람이 나옵니다.");
			break;
		case 2:
			System.out.println("중간 바람이 나옵니다.");
			break;
		case 3:
			System.out.println("강한 바람이 나옵니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다!");
		
			sc.close();
		}
		
		
		
		
	}

}
