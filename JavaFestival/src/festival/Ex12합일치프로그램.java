package festival;

import java.util.Random;
import java.util.Scanner;



public class Ex12합일치프로그램 {

	public static void main(String[] args) {

		// 랜덤으로 숫자 뽑아 두 수 합 일치 ->O "Success" ->X "Fail"
		// 기회 5번 실패 "GAME OVER"
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int fail = 0;
		while (true) {

			int num1 = rd.nextInt(9) + 1; // 0~8 //+1해주면 1~9
			int num2 = rd.nextInt(9) + 1;

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
	

		
		
		
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		int fail = 0;
//
//		for (int i = 0; i < 10; i++) {
//			int temp1 = (int) (Math.random() * 10);//소숫점 랜덤값*10 = 10까지 정수
//			int temp2 = (int) (Math.random() * 10);
//
//			//System.out.printf("%d +%d = ", temp1, temp2);
//			System.out.print(temp1 +" + "+temp2+" = ");
//			int num = sc.nextInt();
//			if (num == (temp1 + temp2)) {
//				System.out.println("SUCCESS!");
//			} else {
//				System.out.println("Fail...");
//				fail++;
//			}
//			if (fail == 5)
//				break;
//		}
//		System.out.println("GAME OVER!");
//
//		sc.close();

	}
}

//			import java.util.Random;
//
//			public class Main {
//			    public static void main(String[] args) {
//			        // Random 객체 생성
//			        Random rd = new Random();
//
//			        // 0부터 100 사이의 랜덤 정수 생성
//			        int randomNumber = random.nextInt(100);
//
//			        // 랜덤 정수 출력
//			        System.out.println("생성된 랜덤 정수: " + randomNumber);
//			    }
//			}