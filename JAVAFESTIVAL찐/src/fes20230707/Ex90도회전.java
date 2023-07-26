package fes20230707;

public class Ex90도회전 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];
		int cnt = 1;

		// 입력부
		for (int k = 0; k < arr.length; k++) {
			for (int i = 0; i < arr.length; i++) {

				arr[k][i] = cnt++;
			}
		}
		//출력부
		System.out.println("원본");
		for (int k = 0; k < 5; k++) {

			for (int i = 0; i < 5; i++) {

				System.out.print(arr[k][i] + "\t");
			}
			System.out.println();
		}

		System.out.println("90도 회전 ");
		for (int k = 0; k < arr.length; k++) {

			for (int i = 0; i < arr[k].length; i++) {

				System.out.print(arr[i][4 - k] + "\t");
			}
			System.out.println();
		}

	}

}
