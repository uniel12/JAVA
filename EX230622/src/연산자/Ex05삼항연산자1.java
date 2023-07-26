package 연산자;

import java.util.Scanner;

public class Ex05삼항연산자1 {

	public static void main(String[] args) {
		
		// 삼항연산자
		// 간단하게 식을 제어할 때 사용
		// (조건식)? (true일 때 실행문): (faulse일 떄 실행문)
		
		
		//예제1
		// 두 정수를입력 받아서 (num1,num2) ->Scanner 사용
		// 조건 : num1이 num2보다 크면 true 출력
		//		 num1이 num2보다 작거나 같으면 false 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" num1 : ");
		int num1 = sc.nextInt();
		System.out.print(" num2 : ");
		int num2 = sc.nextInt();
		
		//boolean result = num1 > num2 ? true : false;
		
		System.out.println(num1 > num2 ? true : false);
		
		sc.close();
		
	}

}
