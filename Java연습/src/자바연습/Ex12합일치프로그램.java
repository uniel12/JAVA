package 자바연습;

import java.util.Random;
import java.util.Scanner;

public class Ex12합일치프로그램 {

	public static void main(String[] args) {
		// 랜덤으로 숫자 뽑아 두 수 합 일치 ->O "Success" ->X "Fail"
		// 기회 5번 실패 "GAME OVER"
		
		//rd,sc도구 불러오기
		//fail 카운트 변수 만들기
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int fail = 0;
		//while문
		while(true) {
			// 1 ~ 9 랜덤 수 2개 뽑기
			int num1 = rd.nextInt(9)+1;
			int num2 = rd.nextInt(9)+1;
			// 정수 두개 더한 입력값 뽑기
			System.out.print(num1+"+"+num2+"=");
			int ans = sc.nextInt();
				// 성공
			if(ans == num1+num2) {
				System.out.println("SUCCESS!");
				// 실패
			}else{
				System.out.println("Fail...");
				fail++;
			}				
				//실패 다섯번시 "GAME OVER!"
			if(fail == 5) {
				System.out.println("GAME OVER!");
				break;
			}
			
		}
		sc.close();
	}

}
