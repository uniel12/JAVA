package 자바연습;

import java.util.Scanner;

public class Ex01반올림 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//+5/10*10
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("반올림 수 : " + (num+5)/10*10);
		
		sc.close();

	}

}
