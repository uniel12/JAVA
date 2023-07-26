package 연산자;

public class Ex03논리연산자 {

	public static void main(String[] args) {
	
		//
		// 논리연산자
		
		// 부정(NOT) 연산자 -> !
		// 앞선 값의 반대값을 나타내고 싶을 때 사용!
		boolean check = true;
		System.out.println(!check);
		
		int a = 5;
		int b = 13;
		System.out.println(!(a>b)); // true
		System.out.println("--------------------");
		
		// 곱(AND)연산자-> &&
		System.out.println( (10 > 3) && (5 < 2) );
		System.out.println( (10 <= 3) && (5 < 2) ); // 노 ->Dead code 필요없는(안써도 되는) 코드
		System.out.println( (10 != 3) && (5 >= 2) );
		System.out.println("--------------------");

		
		// 합(OR)연산자 -> ||
		System.out.println( (10 > 3) || (5 < 2) );
		System.out.println( (10 <= 3) || (5 < 2) ); 
		System.out.println( (10 != 3) || (5 >= 2) );
		
		
		
		
	}

}
