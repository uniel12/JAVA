package while문;

import java.util.Scanner;

public class Ex03실습3 {

	public static void main(String[] args) {
		// 예제3
		// 홀, 짝 카운트하는 프로그램
		Scanner sc = new Scanner(System.in);

		int even = 0; // 짝수 개수 카운트
		int odd = 0; // 홀수 개수 카운트

		while (true) {
			System.out.print("숫자입력 : ");
			int num = sc.nextInt();

			if (num == -1) {
				System.out.println("종료되었습니다.");
				break;
			} else if (num % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			System.out.println("짝수개수 : " + even);
			System.out.println("홀수개수 : " + odd);
		}

		sc.close();
	}

}
