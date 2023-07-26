package 자바연습;

import java.util.Scanner;

public class Ex03거스름돈 {

	public static void main(String[] args) {
		// 배열 몫 나머지
		Scanner sc = new Scanner(System.in);
		
		System.out.print("총 금액 입력 : ");
		int money = sc.nextInt();
		int []arr = {10000,5000,1000,500,100};
		int []arr2 = new int [5];
		
		System.out.println("\n잔돈 : "+ money +"원");
		
		for(int i = 0; i<arr.length; i++) {
			arr2[i]=money/arr[i];
			money= money%arr[i];
			System.out.println(arr[i]+"원 : "+arr2[i]+"개");
		}
		
		sc.close();
	}

}
 