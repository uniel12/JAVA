package ex230703;

public class Ex12메소드실습4 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		boolean divisor = isDivisor(num1,num2);
		
		System.out.println(divisor);

	}

	private static boolean isDivisor(int num1, int num2) {
		if (num1%num2 == 0) {
			return true;
		}else {
			return false;
		}
	}

}
