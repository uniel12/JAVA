package festival;

import java.util.Scanner;

public class Ex30세자리수곱 {

	public static void main(String[] args) {
		// (세 자리 수)*(세 자리 수)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번쨰 숫자 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번쨰 숫자 입력 >> ");
		String num2 = sc.next();
		
		// .split("특정 문자" -> 특정문자를 기준으로 문자열을 잘라주는 함수(기능)
		// 공백 주의
		
		String [] arr = num2.split("");
		for(int i=arr.length-1; i>=0; i--) {
			int a = Integer.parseInt(arr[i]);
		System.out.println(num1 *a);

		}
		System.out.println(num1*Integer.parseInt(num2));
		
		
		
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
