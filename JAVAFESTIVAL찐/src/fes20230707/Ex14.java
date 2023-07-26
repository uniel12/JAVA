package fes20230707;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int [][]arr = new int [n][n];
		
		int cnt=0;
		
		
		for(int k=0; k < arr.length;k++) {
			cnt++;
			for(int i=0; i < k; i++) {
				arr[k][i]=cnt;
				System.out.println(arr[k][i]);
			}
			
			for(int i=k; i >= 0 ; i--) {
				arr[k][i]=cnt;
			System.out.println(arr[n-k][i]);
			}
			
			
		}

	}

}
