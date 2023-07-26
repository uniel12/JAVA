package festival;

import java.util.Scanner;

public class Ex32_2진수10진수변환 {

	public static void main(String[] args) {

		// 문자열 형태의 2진수를 입력받아 10진수로 바꾸는 프로그램
		// 다시 보기

		Scanner sc = new Scanner(System.in);
		// 01001101
		// (2^6*1)+(2^3*1)+(2^2*1)+(2^0*1)

		String str = sc.next(); // 2진수
		String[] arr = str.split("");

		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("1")) {
				result = result * 2 + 1;
			} else if (arr[i].equals("0")) {
				result = result * 2;
			}
		}
		System.out.println(str + "(2) = " + result + "(10)");
		sc.close();

	}

}

// 2진수 -> 10진수
//191 ( 2로 계속 나눔)
//191%2=1
//95%2 =1
//47%2 =1
//23%2 =1
//11%2 =1
//5%2  =1
//2%2 = 0
//1%2 =1 ->10111111

//10111111
//1 -> 1*2+1
//
