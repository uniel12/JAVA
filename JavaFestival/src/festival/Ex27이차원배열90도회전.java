package festival;

public class Ex27이차원배열90도회전 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("원본");

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
				System.out.print(array[k][i] + "\t");
			}
			System.out.println();
		}

		System.out.println("\n"+"90도 회전");
		
		// 출력부
		for (int k = 0 ; k < array.length; k++) {

			for (int i = 0; i < array[k].length; i++) {
				System.out.print(array[i][4-k] + "\t");
			}
			System.out.println();
		}
		
		

	}

}
