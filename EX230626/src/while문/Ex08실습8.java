package while문;

import java.util.Scanner;

public class Ex08실습8 {

	public static void main(String[] args) {
		// (+ , -) 계산기 프로그램
		Scanner sc = new Scanner(System.in);
	
		while (true) {

			System.out.print("첫 번째 정수를 입력하세요>> ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 정수를 입력하세요>> ");
			int num2 = sc.nextInt();
			System.out.print("[1]더하기 [2]빼기>>");
			int num3 = sc.nextInt();

			if (num3 == 1) {
				//더하기
				System.out.println("더하기 연산 결과는 " + (num1 + num2)+ "입니다.");
			} else {
				//빼기
				System.out.println("뺴기 연산 결과는" + (num1 - num2) + "입니다.");
			}
			
			System.out.print("다시 실행하시겠습니까? (Y/N) >>");
			String answer = sc.next();
				if (answer.equals("N")) {
					System.out.println("종료합니다.");
					break;
				}

			}
		sc.close();
		}
	}


