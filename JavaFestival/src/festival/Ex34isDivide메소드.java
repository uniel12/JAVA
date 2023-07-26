package festival;

import java.util.Scanner;

public class Ex34isDivide메소드 {

	public static void main(String[] args) {
		// 두개의 정수를 매개변수로 입력 받아
		// 앞의 정수가 뒤의 정수로 나누어지는지를 판별하는 메소드 is Divide()
		// 나누어지면 true , 나누어지지 않으면 false 반환
		Scanner sc = new Scanner(System.in);

		System.out.print("num1 : ");
		int num1 = sc.nextInt();
		System.out.print("num2 : ");
		int num2 = sc.nextInt();

	        boolean result = isDivide(num1, num2);
	        
	        System.out.println("결과 확인 : " + result);
	        sc.close();
		}
	    public static boolean isDivide(int num1, int num2) {
			
			if((double)num1/num2 == (int)num1/num2) {
				return true;
			}
			else {
				return false;
			}
	    }
	}