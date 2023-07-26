package 연산자;

import java.util.Scanner;

public class Ex06삼항연산자2 {

	public static void main(String[] args) {
		
		//예제2
		// 정수 하나 입력받기(num) ->Scanner
		// num이 짝수라면 -> "짝수" 출력
		// num이 홀수라면 -> "홀수" 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		// num이 짝수라면 num%2 = 0
		// num이 홀수라면 num%2 = 0
		
		//String result = num%2==0 ? "짝수" : "홀수";
		//System.out.println(result);
		System.out.println( num%2==0 ? "짝수" : "홀수");
		
		sc.close();

	}

}
