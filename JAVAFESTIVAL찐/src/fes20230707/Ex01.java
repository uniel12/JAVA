package fes20230707;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]= new int [5];
		int temp=0;
		for(int i=0; i<5; i++) {
			System.out.print(i+1+"번째 수 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("정렬 후");
		
		for(int i=0; i<4; i++) {
			if(arr[i]<arr[i+1]) {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			
		}

		for(int i =4; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
