package while문;

import java.util.Scanner;

public class Ex05실습5 {

	public static void main(String[] args) {
		//do-while 예제
	Scanner sc = new Scanner(System.in);
	

	int num;
	do{
		
		System.out.print(">");
		num = sc.nextInt();
	
	}while (num != 0); 
	
	System.out.println("프로그램 종료!");
	
	sc.close();
	}

}
