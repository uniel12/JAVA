package 조건문;

import java.util.Scanner;

public class Ex04if_else문2 {

	public static void main(String[] args) {
		
		// 예제2
		// 정수 입력 받아 1의 자리에서 반올림 후 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		System.out.print("반올림 수 : ");
		if(num%10 < 5 ) {
			System.out.println(num -num%10);
		}else {
			System.out.println(num - num%10 + 10);
			
		}
//		if(num%10 < 5 ) {
//			//버림
//		System.out.println(num/10*10);
//		}else {
//			
//			//올림
//		System.out.println((num/10 +1 )*10);
//		}
		sc.close();
	}

}
