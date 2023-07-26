package while문;

import java.util.Scanner;

public class Ex02실습2 {

	public static void main(String[] args) {
		
		// 예제2
		// 반복되는 코드
		// " 숫자입력: " + sc.nextInt();
		// "누적결과: " + 누적합
		Scanner sc = new Scanner(System.in);
		
		
		int sum = 0; // 누적합을 담을 변수
		while(true) {
			
			System.out.print("숫자입력 : ");
			int num = sc.nextInt();
			sum += num;
			System.out.println("누적 결과 : " + sum);
			if(num == -1) {
				System.out.print("종료되었습니다.");
				break;
			}
			
			
		}
		
		sc.close();

	}

}
