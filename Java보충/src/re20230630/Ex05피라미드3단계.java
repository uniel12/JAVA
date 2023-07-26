package re20230630;

import java.util.Scanner;

public class Ex05피라미드3단계 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N 높이의 피라미드 출력하기 : ");
		int N = sc.nextInt();
		
		
		int cnt = 1;
		//입력부
		for (int k = 0; k <N ; k++) {
			for (int i = 0; i < N; i++) {
				cnt++;
			}
		}
		
		// 출력부
		for (int j = 0; j <N; j++) {
		for (int k = 0; k <N; k++) {

			for (int i = 0; i < N-k; i++) {
				System.out.print(k+","+i + "\t");
			}
			System.out.println();
		}
		
		}

	}

}
