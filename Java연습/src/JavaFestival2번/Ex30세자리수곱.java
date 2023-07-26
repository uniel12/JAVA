package JavaFestival2번;

import java.util.Scanner;

public class Ex30세자리수곱 {

	public static void main(String[] args) {
		// (세 자리 수)*(세 자리 수)
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번쨰 숫자 입력 >> ");
		int a = sc.nextInt();
		System.out.print("두 번쨰 숫자 입력 >> ");
		int b = sc.nextInt();
		// 385

		int temp3 = b % 10; // 1의 자리
		int temp2 = b / 10 % 10; // 10의 자리
		int temp1 = b / 100 % 10; // 100의 자리

		System.out.println( a * temp3);
		System.out.println( a * temp2);
		System.out.println( a * temp1);
		System.out.println( a * b);

		sc.close();
	}

}

//	System.out.print("첫 번째 숫자 입력 >> ");
//	int num1 = sc.nextInt();
//	System.out.print("두 번째 숫자 입력 >> ");
//	int num2 = sc.nextInt();
//	
//	System.out.println(num1 * num2%10);
//	System.out.println(num1 * (num2%100/10));
//	System.out.println(num1 * (num2/100));
//	System.out.println(num1 * (num2%10) + num1 * (num2%100/10)+num1 * (num2/100));
//sc.close();
//}
//}
