package ex0629;

public class Ex07이차원배열5 {

	public static void main(String[] args) {
		// 이차원 배열 숫자진행 방향 우->좌 ,상->하

		// 5행 5열의 이차원 배열 생성하기
		int[][] array = new int[5][5];

		int cnt = 1;
		// 입력부
		for (int k = 0; k < array.length; k++) {
			for (int i = 0; i < array[k].length; i++) {
				array[k][i] = cnt++;
			}
		}
		// 출력부
		for (int k = 0; k < array.length; k++) {
			for (int i = 0; i < array[k].length; i++) {
			
					System.out.print(array[4-i][k] + "\t");
				
			}
			System.out.println();

		}

	}

}
