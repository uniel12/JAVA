package festival;

import java.util.Scanner;

public class Ex01반올림 {

	public static void main(String[] args) {

		// 단순 산술식으로 계산하는 방법
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		System.out.print("반올림 수 : " + (num + 5) / 10 * 10);

//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("숫자 입력 : ");
//		int num = sc.nextInt();
//		System.out.print("반올림 수 : ");
//		if (num % 10 < 5) {
//			System.out.println(num - num % 10);
//		} else {
//			System.out.println(num - num % 10 + 10);
//
//		}

//		        
//		 //반올림 정의와 int를 이용한 방법
//		 //num1 +5 를 하고 /10*10을 하면 1의자리 0~4는 10의자리 그대로, 0~5는 10의자리 +1

		sc.close();

	}

}
