package 자바연습;

import java.util.Scanner;

public class Ex18_3의배수 {

	public static void main(String[] args) {
		int arr[]=new int [10];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			System.out.print((i+1)+ "번째 정수 입력>>");
			arr[i] = sc.nextInt();
			
		}
		
		System.out.print("3의 배수 : ");
		
		for(int i =0; i<arr.length;i++) {
		if(arr[i]%3==0) {
			System.out.print(arr[i]+" ");
		}
		}
		sc.close();
	}

}
