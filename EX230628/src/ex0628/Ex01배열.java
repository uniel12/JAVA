package ex0628;

import java.util.Random;
import java.util.Scanner;

public class Ex01배열 {

	public static void main(String[] args) {
		
		// 변수 선언
		int a;
		
		// 변수 초기화(최초의 할당)
		a = 5;
		
		//VS
		
		// 배열 선언 및 생성하는 방법
		// 데이터 타입[] 레퍼런스변수 = new 데이터타입[배열의 크기];
		//int []numbers =new int[4];
		// 배열 선언
		int[] numbers;
		// new : 생성할 때 쓰는 키워드
		numbers= new int [4];
		
		// 기본데이터 타입 (8가지)
		// byte,char, double, int...
		
		// 레퍼런스 타입
		// Scanner, Random, 배열 ,String...
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		String name = new String("서윤");
		String name2 = "서윤";
		
		System.out.println(a);
		System.out.println("배열의 주소값" +numbers); //주소값을 4byte
		System.out.println();
		// 인덱스 값 접근
		// 배열의 이름 [인덱스번호]
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println();
		// 인덱스 값 수정(넣어주기)
		numbers[0] = 5;
		numbers[1] = 10;
		numbers[2] = 56;
		numbers[3] = 75;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println();
		// for문 사용해서 배열 안에 있는 값 출력
		// 배열 for문 범위 지정시 <=가 아닌 <로 범위 지정
		// 배열의 크기 :배열이름.length
		for (int i=0; i< numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println();
		// 배열 생성 방법 2가지
		// 1. new 키워드 사용해서 생성
		// new 데이터타입 [배열크기]; 
		
		// 2. 배열 선언과 동시에 초기화
		// 배열 안에 어떤 데이터가 들어갈지 명확하게 알 때
		int[] array = {1,2,3,4,5,6};
		for(int i=0; i < array.length;i++) {
			
		System.out.print(array[i]+" ");
		}
		
		System.out.println();
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
