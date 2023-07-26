package festival;

import java.util.Scanner;

public class Ex02시급계산기 {

	public static void main(String[] args) {

		// 일한 시간을 입력받아 총임금 계산
		// 시급 : 5000원 (8시간 초과 근무시간 1.5배 시급)
		Scanner sc = new Scanner(System.in);

		System.out.print("일한시간을 입력하세요 : ");
		int hour = sc.nextInt();
		int over = (int)((hour-8)*5000*1.5 + 8*5000);
		
		if (hour <= 8) {
			System.out.println("총 임금은" + hour * 5000 + "입니다.");
		} else if (hour > 8) {
			System.out.println("총 임금은 " + over + "원 입니다.");
		}

		sc.close();

	}

}
