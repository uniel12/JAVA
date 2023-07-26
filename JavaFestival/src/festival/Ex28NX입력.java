package festival;

import java.util.Scanner;

public class Ex28NX입력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// N과 X를 입력
		System.out.print("N 입력>>");
		int n = sc.nextInt();
		System.out.print("X 입력>> ");
		int x = sc.nextInt();

		int[] arr = new int[n];
		// N개의 정수를 입력
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print((i + 1) + "번째 정수 입력>> ");
			arr[i] = sc.nextInt();
		}
		// N개의 숫자 중 X보다 작은 수만 출력
		System.out.print("결과 >> ");

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < x) {
				System.out.print(arr[i]+" ");
				

			}

		}

		sc.close();
	}

}
