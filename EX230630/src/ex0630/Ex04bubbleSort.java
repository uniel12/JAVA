package ex0630;

import java.util.Arrays;

public class Ex04bubbleSort {

	public static void main(String[] args) {

		// 버블정렬을 이용해 오름차순 정렬
		// 비교하기 위해서 처음부터 내림차순으로 초기화해주기

		int[] array = { 9, 7, 6, 3, 1 };
		int temp;

			// 최종
		for (int k = 1; k < array.length; k++) {
			for (int i = 0; i < array.length - k; i++) {

				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}

			}
		}
		System.out.println(Arrays.toString(array));

		// 1step : 7 6 3 1 9
		// [0]인덱스 [1]인덱스 비교
//		for (int i = 0; i < array.length - 1; i++) {
//
//			if (array[i] > array[i + 1]) {
//				temp = array[i];
//				array[i] = array[i + 1];
//				array[i + 1] = temp;
//			}
//
//		}
//		System.out.println(Arrays.toString(array));

		// 2step : 6 3 1 7 9
//		for (int i = 0; i < array.length - 2; i++) {
//			if (array[i] > array[i + 1]) {
//				temp = array[i];
//				array[i] = array[i + 1];
//				array[i + 1] = temp;
//			}
//		}
//		System.out.println(Arrays.toString(array));
//		
		// 3step
//		for (int i = 0; i < array.length - 3; i++) {
//			if (array[i] > array[i + 1]) {
//				temp = array[i];
//				array[i] = array[i + 1];
//				array[i + 1] = temp;
//			}
//		}
//		System.out.println(Arrays.toString(array));

		// 4step
//		for (int i = 0; i < array.length - 4; i++) {
//			if (array[i] > array[i + 1]) {
//				temp = array[i];
//				array[i] = array[i + 1];
//				array[i + 1] = temp;
//			}
//		}
//		System.out.println(Arrays.toString(array));

//		if (array[0]> array[1]) {
//			temp = array[0];
//			array[0]= array[1];
//			array[1]=temp;
//		}
//		System.out.println(Arrays.toString(array));
//		if (array[1]> array[2]) {
//			temp = array[1];
//			array[1]= array[2];
//			array[2]=temp;
//		}

		// {4, 2, 3, 5, 1 }(5개의 수)
		// (2 4) (3,4) (4,5) (1,5)

	}

}
