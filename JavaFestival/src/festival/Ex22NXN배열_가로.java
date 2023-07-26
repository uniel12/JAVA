package festival;

import java.util.Scanner;

public class Ex22NXN배열_가로 {

	public static void main(String[] args) {
		// N*N 배열 숫자 진행 방향 ㄹ(좌->우 , 우->좌 반복)
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][N];

		int cnt = 1;
		// 입력부
		for (int k = 0; k < arr.length; k++) {
			for (int i = 0; i < arr[k].length; i++) {
				arr[k][i] = cnt++;
			}
		}
		// 출력부
		for (int k = 0; k < arr.length; k++) {
			for (int i = 0; i < arr[k].length; i++) {
				if (k % 2 == 0) {
					System.out.print(arr[k][i] + "\t");

				} else if (k % 2 == 1) {
					System.out.print(arr[k][(N - 1) - i] + "\t");
				}
			}
			System.out.println();
		}

//		for (int b = 0; b < arr.length; b++) {
//			for (int a = 0; a < arr.length; a++) {
//				if (b % 2 == 0) {
//					arr[b][a] = b * N + (1 + a);
//					System.out.print(arr[b][a] + "\t");
//				} else {
//					arr[b][a] = (b + 1) * N - a;
//					System.out.print(arr[b][a] + "\t");
//				}
//			}
//			System.out.println();

		// 1 1+1 1+2 1+3 ... N
		// 2N 2N-1 ... 2N-(N-1)
		// N+N ... N+3 N+2 N+1
		// 2N+1(=3N-(2N-1) .... 3N

		// 0행
//		for (int a = 0; a < arr.length; a++) {
//			arr[0][a] = 1 + a;
//			System.out.print(arr[0][a] + "\t");
//		}
//		System.out.println();
		// 1행
//		for (int a = 0; a < arr.length; a++) {
//			arr[1][a] = 2 * N - a;
//			System.out.print(arr[1][a] + "\t");
//		}
//		System.out.println();
		// 2행
//		for (int a = 0; a < arr.length; a++) {
//			arr[2][a] = (2 * N + (1 + a));
//			System.out.print(arr[2][a] + "\t");
//		}
//		System.out.println();
		// 3행
//		for (int a = 0; a < arr.length; a++) {
//			arr[3][a] = (4 * N - a);
//			System.out.print(arr[3][a] + "\t");
//		}
//		System.out.println();
		// 4행
//		for (int a = 0; a < arr.length; a++) {
//			arr[4][a] = (4 * N + (1 + a));
//			System.out.print(arr[4][a] + "\t");
//		}

		sc.close();
	}
}