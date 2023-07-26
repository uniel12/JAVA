package ex230703;

import java.util.Scanner;

public class Ex09메소드실습1 {

	public static void main(String[] args) {
		
		// 2개의 양수를 입력 받아
		// 그 중 더 큰 수를 반환하는 메소드 largerNumbers()
		// 두 수가 같다면 0을 반환
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 양수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 양수 : ");
		int num2 = sc.nextInt();
		
		
		
		int result = largerNumbers(num1, num2);
		System.out.println("더 큰 수 : "+result);
	
		sc.close();
	}
	
	public static int largerNumbers(int a, int b) {
		
		if(a == b) {
			return 0;
		}else {
			return a> b? a:b;
		}
		
//		int result = 0;
//		if (a > b) {
//			result = a;
//		}else if(a < b ) {
//			result = b;
//		}
//		return result;
	
	}
	
	
	
}
