package buildUp;

import java.util.Scanner;

public class Ex03ScannerClose {

	public static void main(String[] args) {

		// 스캐너 사용해서 달러를 입력했을 때 원화로 환전해주는 프로그램
		// while문 사용해서 계속 입력받다가 -1을 입력하면 탈출!
		// 달러 입력 : 2 (1300원 기준)
		// ~~원 입니다. 출력
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("달러 입력 : ");
			int usd = sc.nextInt();

			if (usd == -1) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				int krw = usd * 1300;
				System.out.println(krw + "원입니다.");
			}
		}
		sc.close();
	}

}
