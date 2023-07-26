package ex230703;

public class Ex13메소드실습5 {

	public static void main(String[] args) {

		int num = 100;
		int result = getSum(num);

		System.out.println(num + "의 약수의 합 : " + result);
		getDivisor(num);

	}

	private static void getDivisor(int num) {
		String result = "";
		for (int i = 1; i <= 100; i++) {
			// 약수라면 출력
			if (num % i == 0) {
				result += i + " ";
			}
		}
		System.out.println(num + "의 약수 : " + result);
	}

	private static int getSum(int num) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

}
