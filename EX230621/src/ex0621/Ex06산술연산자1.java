package ex0621;

public class Ex06산술연산자1 {

	public static void main(String[] args) {
		
		
		
		//연산자의 종류
		//단항 연산자 : 증감 연산자
		//이항 연산자 : 산술연산자, 대입연산자, 비교 연산자, 논리 연산자, +) 비트 연산자 시프트 연산자
		//삼항 연산자 : 조건연산자
		int num1 = 7;
		int num2 = 3;
		
		// 출력문을 사용해서 num1과 num2의 +,-,*,/,%
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2); 
		System.out.println(num1%num2);

		
		
		float num3 = 7.0f;
		float num4 = 3.0f;
		
		//정수 연산 정수 -> 정수
		System.out.println(num1 / num2);  //2
		
		//정수 연산 실수 ->  실수
		System.out.println(num1 / num4);  //2.3333..
		
		// 실수 연산 정수 -> 실수
		System.out.println(num3 / num2);  //2.3333..
		
		
		
		
 }
}
