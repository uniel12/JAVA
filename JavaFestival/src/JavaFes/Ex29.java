package JavaFes;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		// 대시의 갯수를 결과값으로 돌려받자
		// 1. 입력하는 도구 가져오기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		
		
		// 3. 대시의 총합을 구해서 출력하기
		// 6 2 5 5 4 5 6 4 7 6 --> 0~9의 대시 개수
		
		// 방법1) 공백으로 쪼개서 배열에 저장해놓은 값들을 
		// 하나하나 비교해서 대시의 총합을 구한다
//		String num = sc.next();
//		String[] arr = num.split("");
//		int sum=0;
//		
//		for(int i = 0; i < arr.length; i++) {
//	         if(arr[i].equals("1")) {
//	            sum+=2;
//	         }else if(arr[i].equals("2")) {
//	            sum+=5;
//	         }else if(arr[i].equals("3")) {
//	            sum+=5;
//	         }else if(arr[i].equals("4")) {
//	            sum+=5;
//	         }else if(arr[i].equals("5")) {
//	            sum+=5;
//	         }else if(arr[i].equals("6")) {
//	            sum+=5;
//	         }else if(arr[i].equals("7")) {
//	            sum+=5;
//	         }else if(arr[i].equals("8")) {
//	            sum+=5;
//	         }else if(arr[i].equals("9")) {
//	            sum+=5;
//	         }else {
//	            
//	         }
//	      }

		// 방법2) 숫자로 입력받아서 23번 문제 알고리즘을 사용해서
		//		 숫자 한개씩 분리 , 그 값을 대시의 총합 구하기
		//+ 이 문제는 각 숫자의 대시의 개수가 저장된 배열이 필요
		int sum =0;
		int num = sc. nextInt();
		int []arr = {6,2,5,5,4,5,6,4,7,4}; //0~9대시의 개수
		
		while (num>0) {
			int i = num%10;
			sum += arr[i];
			num/=10;
			
		}
		System.out.println(sum);
		
		

	}

}
