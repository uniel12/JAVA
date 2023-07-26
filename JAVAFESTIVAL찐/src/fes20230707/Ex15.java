package fes20230707;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		int fac=1;
		for(int i=num; i >0; i--) {
			fac *= i;
		}
					
			System.out.println("출력 : "+ fac);


}
}
