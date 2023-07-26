package 자바연습;

import java.util.Scanner;

public class Ex21NxN세로 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		int arr[][]=new int [n][n];
		for (int k=0; k<n; k++) {
		for(int i=0; i<arr[k].length; i++) {
		arr[k][i]=(k+1)+n*i;
		System.out.print(arr[k][i]+"\t");
		}
		System.out.println();
		}

		sc.close();
	}

}
