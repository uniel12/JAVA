package 자바연습;

import java.util.Scanner;

public class Ex19로또 {

	public static void main(String[] args) {
		// 중복없이 숫자 뽑는 로또
		// 로또는 총 6자리
		Scanner sc = new Scanner(System.in);

		int[] n = new int[6];

		for (int i = 0; i < n.length; i++) {
			n[i] = (int)(Math.random()*45) + 1;
			for(int j =0; j<i;j++) {
				if(n[j]==n[i]) {
					i--;
				}
			}

		}
		for (int i = 0; i < n.length; i++) {
			System.out.println("행운의 숫자 :" + n[i]);
		}

		sc.close();
	}

}
