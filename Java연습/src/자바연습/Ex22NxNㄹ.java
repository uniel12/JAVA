package 자바연습;

import java.util.Scanner;

public class Ex22NxNㄹ {

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
				} else {
					System.out.print(arr[k][(N - 1) - i] + "\t");
				}
			}
			System.out.println();
		}
	}
}
