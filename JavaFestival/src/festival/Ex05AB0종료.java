package festival;

import java.util.Scanner;

public class Ex05AB0종료 {

	public static void main(String[] args) {
		// A,B 입력
		// A-B 출력
		// 모두 0입력 시 종료
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("A 입력 >> ");
			int A = sc.nextInt();
			System.out.print("B 입력 >> ");
			int B = sc.nextInt();
			if (A != 0 || B != 0) {
				System.out.println("결과 >> " + (A - B));
			} else if (A == 0 && B == 0) {
				break;
			}

		}
		sc.close();
	}

}
