package festival;

import java.util.Scanner;

public class Ex18_3의배수출력 {

	public static void main(String[] args) {
		
		//숫자 입력 받아 3의 배수 숫자 출력
	
		int[] intArray = new int[10];
		Scanner scanner = new Scanner(System.in);
		
		for (int i=0; i<intArray.length; i++) {
			System.out.print((i+1)+"번째 정수 입력>>");
			intArray[i] = scanner.nextInt();
		}
		System.out.print("3의 배수는 ");
		for (int i=0; i<intArray.length; i++) {
			if (intArray[i] % 3 == 0) 
				// 3으로 나누어 나머지가 0이면 3의 배수
				System.out.print(intArray[i] + " ");
		}
		scanner.close();
		

	}

}
