package ex230703;

public class Ex14메소드실습6 {

	public static void main(String[] args) {
		// 완전수 구하는 메소드
		// 완전수 6 = 1+2+3
		
		int startValue = 1;
		int endValue = 1000;
		System.out.print("1~1000까지의 완전수 :");
		getPerfectNumber(startValue, endValue);
	}

	private static void getPerfectNumber(int s, int e) {

		for (int i = s; i <= e; i++) {

			int sum = 0;
			for (int k = 1; k < i; k++) {
				// k <= i 면 자기가 포함되니까 k < i
				if (i % k == 0) {
					sum += k;
				}
			}

			if (sum == i) {
				System.out.print(i + " ");
			}

		}

	}
}
