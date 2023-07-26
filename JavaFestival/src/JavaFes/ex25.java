package JavaFes;

import java.util.Scanner;

public class ex25 {

	public static void main(String[] args) {
		
		// 1.입력하는 도구 가져오기
		Scanner sc = new Scanner(System.in);
		
		// 2. 숫자를 입력받기
		System.out.println("정수 입력 : ");
		int num =sc.nextInt();
		
		// 총합
		int sum =0;
		
		// 3. 연산자를 사용해서 숫자들을 분리
		while (num > 0) {
			// num을 10으로 나눈 나머지를 sum에 더한다.
			sum += num % 10;
			// num을 10으로 나눈 값을 다시 num에 저장한다.
			num /= 10;
		}
		System.out.println("합은 " + sum + "입니다.");
		sc.close();
		
		
		
	}

}
