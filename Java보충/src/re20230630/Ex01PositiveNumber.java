package re20230630;

import java.util.Scanner;

public class Ex01PositiveNumber {

	public static void main(String[] args) {
		//사용자의 입력을 받을 도구 만들기
		Scanner sc = new Scanner(System.in);
		//while문 만들기
//		int num =-1; //초기값을 -값으로 해야 양수를 입력하세요가 먼저 나옴
//		
//		
//		while(num <= 0) {
//			System.out.println("양수를 입력해주세요:");
//			num = sc.nextInt();
//			
//		}
//		
//		System.out.println("입력하신 양수는"+num+"입니다.");
//		
//		
		//do-while문
		int num; //int num = 0 //초기값이 뭐든 한번은 실행되니까 상관무
		
		do {
			//한번은 실행되고 조건이 일치하면 다시 실행될 문장
			System.out.println("양수를 입력해주세요.");
			num = sc.nextInt();
		}while(num <= 0);
		System.out.println("입력하신 양수는 "+num+"입니다.");
		
		sc.close();  
	}                
                     
}                    
                     