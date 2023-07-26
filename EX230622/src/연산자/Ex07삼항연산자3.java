package 연산자;

import java.util.Scanner;

public class Ex07삼항연산자3 {

	public static void main(String[] args) {
		
		//예제3
		// 두 정수 입력하기(num1 , num2) Scanner
		// num1과 num2 중에서 더 큰수를 판별후 
		// 큰 수에서 작은 수 빼기
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		
		System.out.print("두 수의 차 : ");
		System.out.print( num1 >= num2 ? num1 - num2 : num2 - num1);
		
		//int result = num1 >= num2 ? num1 - num2 : num2 - num1;
		//System.out.println(result);
		
		// System.out.print( "두 수의 차 : " + (num1 >= num2 ? num1 - num2 : num2 - num1) );
		
		sc.close();

	}

}
