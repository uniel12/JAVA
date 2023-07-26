package 자바연습;

import java.util.Scanner;

public class Ex1610진수2진수변환 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 >> ");
		int []arr= new int[4];
		int num = sc.nextInt();
		int i =0;
		
		while(num!=0) {
			arr[i]= num%2;
			num /= 2;
			i++;
		}
		for(int j =arr.length-1; j>=0; j--) {
			System.out.print(arr[j]);
			
		}
		
		sc.close();
	}

}
