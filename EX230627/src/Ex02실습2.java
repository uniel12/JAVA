
import java.util.Scanner;

public class Ex02실습2 {

	public static void main(String[] args) {
		// for문
		// 예제5
		// 구구단

		Scanner sc = new Scanner(System.in);
		System.err.print("단 입력 : ");
		int dan = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}
		sc.close();
	}

}
