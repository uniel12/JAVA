package 조건문;

import java.util.Scanner;

public class Ex06다중if문2 {

	public static void main(String[] args) {
		//예제2
		Scanner sc = new Scanner(System.in);
		//조건
		// 나이가 10이상 20미만 -> "10대입니다."
		// 나이가 20이상 30미만->"20대입니다."
		// 나이가 30이상 40미만 -> "30대입니다."
		// 그 외-> "잘못 입력하셨습니다." 출력
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		if( age >= 10 && age < 20 ) {
			System.out.println("10대입니다.");
		}else if(age >= 20 && age < 30 ) {
			System.out.println("20대입니다.");
		}else if(age >= 30 && age < 40 ) {
			System.out.println("30대입니다.");
		}else { 
			System.out.println("잘못 입력하셨습니다.");
		}
		
		sc.close();
		
		
		
		
		
		
		

	}

}
