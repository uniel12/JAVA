package fes20230707;

import java.util.Scanner;

public class Ex4Bonus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int []arr = new int [5];
		
		for(int i=0; i<5; i++) {
			System.out.print(i+"번째 별의 수 :");
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " : ");
			for(int k = 0; k < arr[i]; k++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
