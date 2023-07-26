package for문;

import java.util.Scanner;

public class Ex03실습3 {

	public static void main(String[] args) {

		// 예제3
		// 숫자 2개를 입력 받아 두수 사이의 총 합을 출력하는 프로그램
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		System.out.print("총합 : ");
		int sum = 0; // 누적합을 담는 변수

		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				
				sum += i;
			}
			System.out.print(sum);
		} else {
			for (int i = num2; i <= num1; i++) {
				
				sum += i;
			System.out.print(sum);
			}
		}

		sc.close();

	}

}
