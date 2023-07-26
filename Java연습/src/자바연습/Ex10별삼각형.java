package 자바연습;

import java.util.Scanner;

public class Ex10별삼각형 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("행 개수 : ");
		int n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print("*");

			}
			System.out.println();
		}

		sc.close();
	}

}
