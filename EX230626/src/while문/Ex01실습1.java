package while문;

import java.util.Scanner;

public class Ex01실습1 {

	public static void main(String[] args) {
		
		// while문
		// while(조건식){
		//	반복할 실행문장;
		// }
		
		// 예제1
		// 조건 : 입력받은 수가 10보다 작을 때만 
		// 반복 : 정수 입력
		// 반복 종료 : 10보다 큰 수 -> "종료되었습니다." 출력
		Scanner sc = new Scanner(System.in);

		
		
		
		while(true) {
			
			System.out.print("정수 입력 : ");
			int num =sc.nextInt();
			
			if(num > 10) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
		
		
		
		sc.close();
	}

}
