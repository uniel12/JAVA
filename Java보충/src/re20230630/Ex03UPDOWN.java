package re20230630;

import java.util.Random;
import java.util.Scanner;

public class Ex03UPDOWN {

	public static void main(String[] args) {
		// 기회는 pay를 다 사용할 때 까지.
		// 1회 도전당 100
		// 정답시 300 및 게임을 다시 시작할지 묻기
		// pay를 다 사용할 경우 최종 정답 횟수 출력

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		int win = 0;
		int pay = 1000;
		while (pay != 0) {
			int comNum = rd.nextInt(99) + 1;

			System.out.println("=======UpDown Game=======");
			System.out.print("=== start 1 === exit 0=== : ");
			int start = sc.nextInt();
			if (start == 0) {
				System.out.println("종료합니다.");
				System.out.println("승리횟수 : " + win);
				break;
			} else if (start == 1) {
				while (true) {

					if (pay == 0) {
						System.out.println("포인트 소진 ");
						System.out.println("승리횟수 : " + win);
						break;
					}

					System.out.print("숫자를 입력하세요 : ");
					int userNum = sc.nextInt();
					if (userNum == comNum) {
						pay += 300;
						System.out.println("정답. 300점 지급" + " 남은 포인트 : " + pay);
						win++;
						break;
					} else if (userNum < comNum) {
						pay -= 100;
						System.out.println("UP. 100점 차감." + " 남은 포인트 : " + pay);
					} else {
						pay -= 100;
						System.out.println("Down. 100점 차감." + " 남은 포인트 : " + pay);
					}
				}
			} else {
				System.out.println("잘못된 입력");
			}

		}
		sc.close();
	}

}
