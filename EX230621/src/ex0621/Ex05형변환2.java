package ex0621;

public class Ex05형변환2 {

	public static void main(String[] args) {

		// 정수형 : byte, int
		// - 128 ~ 127
		byte num1 = 3;
		int num2 = 8000;
		
		num1 = (byte)num2;
		System.out.println(num1);
		// 값이 양의 방향으로 넘어가는 현상 : overflow // 값이 64가 나오는 이유 8000%256 시계방향
		
		int num3 = -129;
		num1 = (byte)num3;
		System.out.println(num1);
		// 값이 음의 방향으로 넘어가는 현상 : underflow 
		
		//int(4byte), short(2byte)
		//			  -32768 ~ 32767
		int num4 =30000;
		short num5 = 0;
		
		//short int(30000)
		  num5 =(short)num4;
		// 들어있는 값과는 상관이 없음 -> 자료형이 상관있음 -> 강제 형변환
		
		
		
		
	}

}
