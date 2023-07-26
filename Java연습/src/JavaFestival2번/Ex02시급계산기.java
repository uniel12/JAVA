package JavaFestival2번;

import java.util.Scanner;

public class Ex02시급계산기 {

	public static void main(String[] args) {

		// 일한 시간을 입력받아 총임금 계산
		// 시급 : 5000원 (8시간 초과 근무시간 1.5배 시급)
		Scanner sc = new Scanner(System.in);

		// 일한 시간 입력
		System.out.print("일한시간을 입력하세요 : ");
		int hour = sc.nextInt();
		// 초과시간 금액 입력  -> 실수로 나와서 정수로 변환해줘야함
		int over = (int)((hour-8)*5000*1.5 + 8*5000);
		
		if (hour <= 8) {
			// 8시간 이하일떄 시급*일한시간
			System.out.println("총 임금은" + hour * 5000 + "입니다.");
		} else if (hour > 8) {
			// 8시간 초과시 초과금액
			System.out.println("총 임금은 " + over + "원 입니다.");
		}

		sc.close();

	}

}
