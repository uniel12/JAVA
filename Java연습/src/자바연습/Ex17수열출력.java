package 자바연습;

import java.util.Scanner;

public class Ex17수열출력 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int n = sc.nextInt();
		
		int a=0; //1씩 증가하는 변수로 각 항에 더해주는 값
		int b=1;//각항에 표기될 값
		for(int i =0; i<n; i++) {
			System.out.print(a+b+" ");
			b+=a;
			a++;
		}
		
	sc.close();
		
	}

}
