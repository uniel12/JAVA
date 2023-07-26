package festival;

import java.util.Random;
import java.util.Scanner;

public class Ex19로또 {

	public static void main(String[] args) {

		// 중복없이 숫자 뽑는 로또
		// 로또는 총 6자리
		Scanner sc = new Scanner(System.in);

		int[] n = new int[6];
		Random rd = new Random();

		for (int i = 0; i < n.length; i++) {
			n[i] = rd.nextInt(45) + 1;

			// 범위는 45란 수를 대입하면 0~44까지 생성,+1을 해주어 1~99까지 표기
			for (int j = 0; j < i; j++) {
				if (n[j] == n[i]) {
					i--;
					break;

				}
			}
		}
		for (int i = 0; i < n.length; i++) {
			System.out.println("행운의 숫자 :" + n[i]);
		}

		sc.close();
	}
}