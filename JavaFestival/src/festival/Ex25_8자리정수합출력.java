package festival;

import java.util.Scanner;

public class Ex25_8자리정수합출력 {

	public static void main(String[] args) {

		int num = 0; // 입력된 숫자가 저장될 변수를 초기화 한다.
		int sum = 0; // 입력된 숫자의 각 자리의 합을 저장할 변수를 초기화 한다.

		System.out.print("정수입력 : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		while (num > 0) {
			// num을 10으로 나눈 나머지를 sum에 더한다.
			sum += num % 10;
			// num을 10으로 나눈 값을 다시 num에 저장한다.
			num /= 10;
		}
		System.out.println("합은 " + sum + "입니다.");
		sc.close();

	}

}

//// 8자리 정수를 입력 받는 배열 만들기
//int[] arr = new int[8];
//
//System.out.print("정수 입력 : ");
//for (int i = 0; i < arr.length; i++) {
//	arr[i] = sc.nextInt();
//}
//
//// 입력받은 정수의 합을 구하기
//int sum = 0;
//for(int i=0; i< arr.length; i++) {
//	sum += arr[i];
//}
//
//// 합 출력
//System.out.println("합은"+ sum+"입니다.");