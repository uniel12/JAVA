package festival;

import java.util.Scanner;

public class Ex11별역삼각형 {

	public static void main(String[] args) {
		
		// 행 개수 입력 받아 삼각형 출력
				Scanner sc = new Scanner(System.in);

				System.out.print("행 개수 : ");
				int n = sc.nextInt();

				for (int i = n; i >= 0; i--) {
					for (int j = 0; j <= i; j++) {
						System.out.print("*");
					}
					System.out.println();
					
				}
				sc.close();

	}

}
