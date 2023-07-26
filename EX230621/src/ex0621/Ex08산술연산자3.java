package ex0621;

import java.util.Scanner;

public class Ex08산술연산자3 {

	public static void main(String[] args) {
		//100자리 미만 버리기
		
		// 정수 입력받기 -> Scanner
		 Scanner sc = new Scanner(System.in); // 노 -> sc is never closed
		 
		 System.out.print("정수입력 : " );
		 int num = sc.nextInt();
		 
		 // () >*,*/ > +,-
		 // 1. 나머지 이용하기
		 System.out.println(num-(num%100));
		 
		 // 2. 몫 이용하기
		 System.out.println(num/100*100);
		 
		 // 3. 정수 +문자("00")
		 System.out.println(num/100+"00");
		 
		 
		 // 4. 강제형변환 이용하기
		 System.out.println((int)(num*0.01)*100);

		 sc.close(); //sc 노란선 없애줌
		 
		 
	}
}	

