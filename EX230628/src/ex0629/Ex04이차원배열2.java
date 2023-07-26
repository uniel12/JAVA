package ex0629;

public class Ex04이차원배열2 {

	public static void main(String[] args) {
		// 이차원 배열 숫자진행 방향 위->아래  
		//출력시 열과 행 바꾸기 k<->i 

		// 5행 5열의 이차원 배열 생성하기
		int[][] array = new int[5][5];
		
		int cnt = 1;
		//입력부
		for (int k = 0; k < array.length; k++) {
			for (int i = 0; i < array[k].length; i++) {
				array[k][i] = cnt++;
			}
		}
		
		// 출력부
		for (int k = 0; k < array.length; k++) {

			for (int i = 0; i < array[k].length; i++) {
				System.out.print(array[i][k] + "\t");
			}
			System.out.println();
		}
		

//		int[][] array = new int[5][5];
//		int cnt = 1;
//		for (int k = 0; k < array.length; k++) {
//
//			for (int i = 0; i < array[k].length; i++) {
//				array[k][i] = cnt++;
//				System.out.print(array[i][k] + "\t");
//			}
//			System.out.println();
//		}
		
		
		
		
		//내방식
//		int cnt = 21;
//
//		for (int k = 0; k < array.length; k++) {
//
//			for (int i = 0; i < array[k].length; i++) {
//				array[k][i] = (cnt+k) +5*i;
//				System.out.print(array[k][i] + "\t");
//			}
//			System.out.println();
//		}
		// 입력부
//		for (int k = 0; k < array.length; k++) {
//
//			for (int i = 0; i < array[k].length; i++) {
//				array[k][i] = (cnt+k) +5*i;
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
//
	}

}
