package ex0621;

public class Ex03자료형 {

	public static void main(String[] args) {
		
		// 줄 이동 : Alt + 방향기(위, 아래)
		// 줄 복사 : Ctrl + Alt + 방향키 (위, 아래)
		// 줄 삭제 : Ctrl + D
		
		// 변수 선언 -> 자료형 변수명 =  데이터;
		
		//데이터 타입
		
		// 1. 논리형
		// boolean : 1bit or 1byte (1 or 0)
		// 참 혹은 거짓(true or )
		boolean isHot = false; // true;
		
		// 2. 문자형
		// char : 2byte -> 2^16 -> 65536
		char grade = 'A';
		char num = '4';
		char slash = '\''; // '\' \n \t
		
		// 3. 정수형
		// byte : 1byte -> 8bit -> 2^8 -> 256가지(-128 ~ 127)
		byte age = 127;
		
		// short : 2byte -> 16bit -> 2^16 -> 65536가지 (-32768~ 32767)
		// int : 4byte
		// long : 8byte
		short money = 32767;
		int account = 2100000000;
		long population = 1000000000L; // 뒤에 영어 l/L붙여주기
		
		// 4. 실수형 -> 소수점 존재	
		// foat : 4byte
		// double : 8byte
		float heght = (float)164.4; // 앞에(float) /뒤에 f, F 붙여주기
		double PI = 3.14159265358;
		
		// 기본 타입
		// 논리형 : boolean
		// 문자형 : char
		// 정수형 : byte, short, int, long
		// 실수형 : float, double
		// 대표 데이터 타입 boolean char int double
		
		// 레퍼런스 타입
		// 문자열을 담는 데이터 타입 
		// String
		String name = "서윤";
		
		
		
		
		
		
		
		
		
	}

}
