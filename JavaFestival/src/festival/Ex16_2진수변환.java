package festival;

import java.util.Scanner;

public class Ex16_2진수변환 {

	public static void main(String[] args) {

		// 10진수 정수 입력 후 2진수 변환 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력>>");
		int array [] = new int[4]; //배열 4칸까지만->0 , 1, 2, 3
		int num = sc.nextInt();
		int i = 0;

		while (num != 0) {
			//입력받은 정수를 나눈 나머지를 배열의 영자리부터 i자리까지 채움
			array[i] = num % 2; 
			//정수의 몫을 또 2로 나누기를 반복
			num /= 2;

			i++;
		}

		for (int j = array.length - 1; j >= 0; j--) {
			
			//위 배열을 3칸부터 0칸까지 배열을 거꾸로 써주면 2진수

			System.out.print(array[j]);

		}
		sc.close();
	}

}

// 정수 10진수 -> 2진수 변환
//2 -> 0
//3 -> 1
//191 ( 2로 계속 나눔)
//191%2=1
//95%2 =1
//47%2 =1
//23%2 =1
//11%2 =1
//5%2  =1
//2%2 = 0
//1%2 =1 ->10111111