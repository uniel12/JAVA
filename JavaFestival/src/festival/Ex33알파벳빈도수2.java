package festival;

import java.util.Scanner;

public class Ex33알파벳빈도수2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력>> ");
		String alpha = sc.nextLine(); // 한줄을 다 읽음
		String[] arr = alpha.split("");

		String[][] alphabet = {
				{ "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
						"U", "V", "W", "X", "Y", "Z" },
				{ "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
						"u", "v", "w", "x", "y", "z" } };
		int[] arr2 = new int[26];
		for (int j = 0; j < arr.length; j++) {
			for (int k = 0; k < alphabet.length; k++) {
				for (int i = 0; i < alphabet[1].length; i++) {
					if (arr[j].equals(alphabet[k][i])) {
						arr2[i] += 1;
					}

				}
			}
		}

		for (int i = 0; i < alphabet[0].length; i++) {
			System.out.println(alphabet[1][i] + ":" + arr2[i]);
		}
		sc.close();
	}
}
