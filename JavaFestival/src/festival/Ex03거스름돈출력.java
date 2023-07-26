package festival;

import java.util.Scanner;

public class Ex03거스름돈출력 {

	public static void main(String[] args) {
		
		// 거스름돈 입력 받아 지폐갯수 출력 프로그램
		// 단, 최대단위 10000원, 최소단위 100원
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("총금액 입력 : ");
		int money = scanner.nextInt();
		
		System.out.println("\n"+"잔돈 : " + money+"원");
		
		
		int arr[] = {10000,5000,1000,500,100};
		int arr2[] = new int[5];
		
		for(int i=0; i<arr.length;i++) {
			arr2[i]=money/arr[i];
			money = money%arr[i];
		}
		for(int i=0; i<arr.length; i++) {
		
		System.out.println(arr[i] + "원 : " +arr2[i]+"개");
		}
		
//		//방식1
//		
//		int c10000 = money/10000;
//		int c5000 = (money%10000)/5000;
//		int c1000 = (money%5000)/1000;
//		int c500 = (money%1000)/500;
//		int c100 = (money%500)/100;
//		
//		System.out.println("10000원 : "+ c10000 + "개"); 	
//		System.out.println("5000원 : "+ c5000 + "개");
//		System.out.println("1000원 : "+ c1000 + "개");
//		System.out.println("500원 : "+ c500 + "개");
//		System.out.println("100원 : "+ c100 + "개");
		
		//방식2
		
//		int num;//지폐갯수
//		num = money/10000; 
//		money = money%10000; 
//		if(num > 0) {
//			System.out.println("10000원 : "+ num + "개"); 
//		}
//		num = money/5000; 
//		money = money%5000; 
//		if(num > 0) {
//			System.out.println("5000원 : "+ num + "개"); 
//		}
//		num = money/1000; 
//		money = money%1000; 
//		if(num > 0) {
//			System.out.println("1000원 : "+ num + "개"); 
//		}
//		num = money/500; 
//		money = money%500; 
//		if(num > 0) {
//			System.out.println("500원 : "+ num + "개"); 
//		} 
//		num = money/100; 
//		money = money%100; 
//		if(num > 0) {
//			System.out.println("100원 : "+ num + "개"); 
//			
//		}
		
		
		scanner.close();

	}

}
