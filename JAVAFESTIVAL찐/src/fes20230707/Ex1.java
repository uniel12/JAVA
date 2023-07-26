package fes20230707;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		int[]arr = new int[8];
		
		int max = arr[0];
		int min = arr[0];
	
		System.out.print("배열에 있는 모든 값 : ");
		for( int i=0; i<8; i++) {
			arr[i]=(int)Math.random();
			
			if(arr[i]<min) {
				 min = arr[i];
			}else if(arr[i]>max) {
				max= arr[i];
			}
			System.out.print(arr[i]);
			
		}
		System.out.println();
		System.out.println("가장 큰 값 : "+ max);
		System.out.println("가장 작은 값 : "+ min);
	}
	


}


