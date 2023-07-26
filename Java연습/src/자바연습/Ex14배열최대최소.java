package 자바연습;

import java.util.Random;

public class Ex14배열최대최소 {

	public static void main(String[] args) {

		Random rd = new Random();

		int[] arr = new int[8];
		int min = 0;
		int max = 0;

		System.out.print("배열에 있는 모든 값 : ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100) + 1;

			if (i == 0) {
				max = arr[i];
				min = arr[i];

			} else if (max < arr[i]) {
				max = arr[i];
			} else if (min > arr[i]) {
				min = arr[i];
			}
			System.out.print(arr[i] + " ");

		}
		System.out.println();
		System.out.println("가장 큰 값 : " + max);

		System.out.println("가장 작은 값 : " + min);

	}

}
