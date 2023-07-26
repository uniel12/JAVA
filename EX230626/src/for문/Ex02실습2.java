package for문;

import java.util.Scanner;

public class Ex02실습2 {

	public static void main(String[] args) {

		// 예제2
		// 100이하의 두 개의 정수를 입력 받아
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();

		// 작은수부터 큰 수까지 1씩 증가하는 프로그램 만들기
		if (num1 < num2) {
		for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		}else{
			for (int i = num2; i <= num1; i++) {
				System.out.print(i + " ");
			}
		}
		
		sc.close();
	}
}