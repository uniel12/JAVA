package ex230703;

//import java.util.Scanner;

public class Ex11메소드실습3 {

	public static void main(String[] args) {
		int base = 2;
		int n = 3;
		// 2개의 정수 base, n 을 받아
		// base의 제곱만큼 값을 반환하는
		// powerN()메소드를 작성
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("base : ");
//		int base = sc.nextInt();
//		System.out.print("n : ");
//		int n = sc.nextInt();

		int result = powerN(base, n);

		System.out.println(" 결과확인 : " + result);
//		sc.close();
	}

	public static int powerN(int base, int n) {
		//base의 n제곱만큼 값을 반환
//		int num =base;
//		for(int i=0; i < n-1; i++) {
//			num*=base; 
//		}
//		
//		return num;
		return (int)Math.pow(base, n);
		}
}
