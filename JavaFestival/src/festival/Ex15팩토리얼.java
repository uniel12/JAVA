package festival;

import java.util.Scanner;

public class Ex15팩토리얼 {

	public static void main(String[] args) {
		
		//1보다 큰 정수(N)를 입력하하여 N!값 구하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		int fac = 1;
		
		for (int i =  num; i > 0; i--) { 
			// (int i=1; i<=num; i++) 조건식을 다음과 같이 변경해도 동일
			fac *=i;
		}

		System.out.println("출력 : " + fac);
		
		
		
				
		
		
		
		
		
		
		
		sc.close();
	}

}
