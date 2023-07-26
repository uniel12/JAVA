package 자바연습;

import java.util.Scanner;

public class Ex02시급계산 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("일한 시간을 입력하세요 : ");
		int hour = sc.nextInt();
		int over = (int) ((hour - 8) * 1.5 * 5000 + 8 * 5000);
		
		if(hour > 8) {
		System.out.println("총 임금은 " + over + "원 입니다.");
		}else {
			System.out.println("총 임금은 " + hour*5000 + "원 입니다.");
		}
	sc.close();
	
	}
}
