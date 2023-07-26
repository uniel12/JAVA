package JavaFes;

public class Ex23 {

	public static void main(String[] args) {

		// 1. point 배열
		int[] point = { 92, 32, 52, 9, 81, 2, 68 };

		// 1) 가장 작은 차이(-) 2) 위치
		// 2. 인덱스 값들이 적어도 서로 한번씩은 빼기 연산이 이루어질 수 있도록
		// -> 자기자신과의 비교는 제외(결과값 0)
		// 빼기 연산결과들은 전부 절대값으로 만들어줘야한다.
		// 가장 작은 값이 나왔을 때! 두 숫자의 위치를 저장!
		int min = Math.abs(point[0] - point[1]);
		// 최솟값에 영향을 주지 않을 배열 내에서의 뺴기 결과값으로 초기화
		int a = 0;
		int b = 0;
		// Math.abs(point[i]-point[j])
		for (int k = 0; k < point.length; k++) {
			// k: 0 1 2 3 4 5 6 ->6번
			for (int i = 0; i < point.length; i++) {
				// i : 0 1 2 3 4 5 6 ->6번
				if (i != k) {
					if (Math.abs(point[k] - point[i]) < min) {
						min = Math.abs(point[k] - point[i]);
						a = k;
						b = i;
					}
				}
			}
		}
		System.out.println("result : ["+a+","+b+"]");
	}

}
