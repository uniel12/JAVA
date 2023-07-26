package ex230703;

public class Ex15메소드오버로딩 {

	public static void main(String[] args) {
		
		// 메소드 오버로딩(중복정의) -> 메소드 이름이 같아야함
		// 조건 1 : 매개변수의 데이터타입으로 구분
		// 조건 2 : 매개변수의 개수로 구분
		
		// 정수 + 정수 add
		add(1,1);
		// 실수 + 정수 add2
		add(1.5,5);
		// 실수 + 정수 +실수 add3
		add(5.6,6,3.8);
		
		System.out.println("===================");
		// 기본적으로 오버로딩된 메소드
		System.out.println(5);
		System.out.println(5.5);
		System.out.println("k");
	}

	public static void add(int num1, int num2) {
		
		System.out.println(num1+num2);
		 
	}
	public static void add(double num1, int num2) {
		
		System.out.println(num1+num2);
		
	}
	public static void add(double num1, int num2,double num3) {
		
		System.out.println(num1+num2+num3);
		
	}
	

	
	
	
	
}
