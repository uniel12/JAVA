package festival;

import java.util.Scanner;

public class Ex09구구단 {

	public static void main(String[] args) {
		// 구구단
		Scanner sc = new Scanner(System.in);

		// 2단부터 시작하고 9단까지 실행하며 반복문이 한번 돌때마다 1씩 증가 시킵니다.
		for (int i = 2; i < 10;) {
			System.out.println("단수 입력 : ");
			i = sc.nextInt();
			System.out.println("어느 수까지 출력 : ");
			int a = sc.nextInt();
			System.out.println(i + "단");

			for (int j = 1; j <= a; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
			break;

		}
		sc.close();
	}
}
