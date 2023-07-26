package ex0628;

import java.util.Scanner;

public class Ex06실습4_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 5칸짜리 배열 생성
		int[] arr = new int[5];

		// 5개의 점수 입력 받기 -> 배열에 차례대로 담기
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 입력 : ");
			arr[i] = sc.nextInt();
		}
		// 입력 받은 값 출력
		System.out.print("입력된 점수 : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int max = arr[0];
		int min = arr[0];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			// 최고 점수 출력
			if (arr[i] > max) {
				max = arr[i];
			}
			// 최저 점수 출력
			if (arr[i] < min) {
				min = arr[i];
			}
			// 점수 총합 출력
			sum += arr[i];

		}
		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
		System.out.println("점수 총합 : " + sum);
		// 점수 평균 출력
		System.out.println("점수 평균 : " + (double)sum/arr.length);
	

		sc.close();
	}

}
