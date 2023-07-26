package ex230703;

public class Ex03메소드1 {

	public static void main(String[] args) {

		// 회사
		System.out.println(5 + 3);
		System.out.println(2 + 12);
		System.out.println(71 + 25);
		System.out.println(10 + 22);
		
		System.out.println("==============");

		// 메소드 호출
		// 메소드 이름(매개변수)
		sum(5, 6);
		System.out.println(sum(5, 6));
		// sub, mul, div 메소드 만들어서 호출
		sub(5, 6);
		mul(5, 6);
		div(5, 6);

	}
	// 메소드 만들기 (main 메소드 밖에)

	// 1. 접근제한자 - public (내/외부에서 접근이 가능한 제한자)
	// 2. static - 저장위치
	// 3. 리턴타입 (리턴타입이 없는 경우 - void 사용)
	// 4. 메소드이름(매개변수) -누가봐도 무슨역할을 하는지 알 수 있게 지어야함

	public static int sum(int num1, int num2) {
//		System.out.println(num1 + num2);
		return num1+num2;
	}

	public static void sub(int num1, int num2) {
		System.out.println(num1 - num2);
	}

	public static void mul(int num1, int num2) {
		System.out.println(num1 * num2);
	}

	public static void div(int num1, int num2) {
		System.out.println(num1 / num2);
	}
	// 호출은 main 메소드 안에서 실행
}
