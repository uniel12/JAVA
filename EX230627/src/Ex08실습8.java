import java.util.Random;
import java.util.Scanner;

public class Ex08실습8 {

	public static void main(String[] args) {

		// 랜덤으로 정수 3개 뽑기(한자리수)
		// 두수의 합을 맞추면 "SUCCESS!" 출력
		// 두수의 합을 틀리면 "Fail..." 출력, 실패변수 +1카운트
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		int fail = 0;
		while (true) {

			int num1 = rd.nextInt(10) + 1; // 0~9 //+1해주면 0~10
			int num2 = rd.nextInt(10) + 1;

			System.out.print(num1 + "+" + num2 + "=");
			int answer = sc.nextInt();

			if (answer == (num1 + num2)) {
				// 성공
				System.out.println("SUCCESS!");
			} else {
				// 실패
				System.out.println("Fail...");
				fail++;

				if (fail == 5) {
					System.out.println("GAME OVER!");
					break;

				}
			}
		}
		sc.close();
	}
}
