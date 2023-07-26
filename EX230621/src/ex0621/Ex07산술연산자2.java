package ex0621;

public class Ex07산술연산자2 {

	public static void main(String[] args) {

		
			// 정수 연산 문자 -> 문자(자동형변환) 
			System.out.println(7+3+"7"); // 107
			System.out.println(7+"3"+7); // 737
			System.out.println("7"+3+7); // 737
			
			// 문자 연산 문자-> 문자
			 String lastName = "서";
			 String firstName = "윤";
			 System.out.println(lastName+firstName); 

			 // 정수
			 int a = 10;
			 // 문자열
			 String b ="9";
			 
			 System.out.println((a+b).getClass().getName());
			 
			 
			 
			 
	}

}
