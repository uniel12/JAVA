package ex230703;

import java.util.Scanner;

public class Ex10메소드실습2 {

	public static void main(String[] args) {
		
		// 2개의 정수를 받아
		// 2개의 숫자 중 10에 더 가까운 수를 반환하는
		// 메소드 close10()
		// 두 숫자 모두 10과의 차이가 같다면 0을 반환
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		int result = close10(num1,num2);
	
		System.out.println("10에 가까운 수 : "+result);
		sc.close();
	}

	public static int close10(int num1, int num2) {
		
		// 1. 어떤 수가 10보다 큰지 모르기 때문에 우선 10을 기준으로 차이값 구하기
//		int a = 10-num1;
//		int b = 10-num2;	
//		if(a <0) {
//			a*= -1;
//		}
//		if(b<0) {
//			b*=-1;
//		}
//		
		// Math 클래스 abs() 함수 (기능 , 메소드) 사용
		int a = Math.abs(10-num1);
		int b =Math.abs(10-num2);
		
		// 2. 10으로부터 더 가까운 수 구하기
		
		if(a == b) {
			return 0;
		}else {
			return a < b? num1 : num2 ;
			}
		
	}
	
	
}
