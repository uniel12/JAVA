package 자바연습;

import java.util.Scanner;

public class Ex04다이어트 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pw;
		int fw;
		int ww;
		int num=1;
		System.out.print("현재몸무게 : ");
		 pw = sc.nextInt();
		
		System.out.print("목표몸무게 : ");
		fw = sc.nextInt();
		
		do {
			System.out.println(num++ +"주차 감량 몸무게 : ");
			ww =sc.nextInt();
			pw-=ww;
		}while(pw>fw); 
		
		sc.close();
	}

}
