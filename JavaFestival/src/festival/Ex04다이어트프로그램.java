package festival;

import java.util.Scanner;

public class Ex04다이어트프로그램 {

	public static void main(String[] args) {
		// 다이어트 관리 프로그램
		// 1. 현재 몸무게와 목표 몸무게를 입력받고,
		// 주차 별 감량 몸무게 입력받기!
		// 2. 목표 몸무게를 달성하면 축하한다는
		// 문구를 출력하고 프로그램 종료!
		// 4개의 변수 입력
		Scanner sc = new Scanner(System.in);
		
		int pw; // 현재몸무게
		int fw; // 목표몸무게
		int ww; // 주차별 감량 몸무게
		int num = 1; // 주차 카운트
		
		System.out.print("현재 몸무게 : ");
		pw = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		fw = sc.nextInt();

		do {
			System.out.print(num++ + "주차 감량 몸무게 : ");
			ww = sc.nextInt();
			pw -= ww;

		} while (pw > fw);

		System.out.println(pw + "kg 달성!! 축하합니다!");

		sc.close();

	}

}
