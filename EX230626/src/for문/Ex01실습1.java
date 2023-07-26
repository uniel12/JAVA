package for문;

public class Ex01실습1 {

	public static void main(String[] args) {

		// for문
		// for(초기화 구문 ; 검사조건 ; 반복후작업){
		// 검사조건이 true일 동안 실행문;
		// }
		// 반복후 작업 생략시 -> 계속 초기화 구문 출력

		// i (= iterator) = 반복되는 변수
		// 예제1
		// for문을 이용하여 21~57 출력
		for (int i = 21; i <= 57; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		// for문을 이용하여 96~53 출력
		for (int i = 96; i >= 53; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		// for문을 이용하여 21~57 중 홀수만 출력
		for (int i = 21; i <= 57; i += 2) {
				System.out.print(i + " ");
		}

	}

}
