package ex0629;

public class Ex03이차원배열1 {

	public static void main(String[] args) {
		// 이차원배열 숫자 진행 방향 좌->우
		// 5행 5열의 이차원 배열 생성하기
		int[][] array = new int[5][5];
		int cnt = 1;
		for (int k = 0; k < array.length; k++) {

			for (int i = 0; i < array[k].length; i++) {
				array[k][i] = cnt++;
				System.out.print(array[k][i] + "\t");
			}
			System.out.println();
		}

		// 입력부
//		for (int k = 0; k < array.length; k++) {
//
//			for (int i = 0; i < array[k].length; i++) {
//				array[k][i] = cnt++;
//			}
//		}
		// 출력부
//		for (int k = 0; k < array.length; k++) {
//
//			for (int i = 0; i < array[k].length; i++) {
//				System.out.print(array[k][i] + "\t");
//			}
//			System.out.println();
//		}

		
		
		
		
		
		// 0행
//		for (int i = 0; i < array[0].length; i++) {
//			array[0][i] = cnt++;
//		
//		}
//
		// 1행
//		for (int i = 1; i < array[1].length; i++) {
//			array[1][i] = cnt++;
//
//		}
		// 2행
//		for (int i = 2; i < array[1].length; i++) {
//			array[2][i] = cnt++;

	}

}
