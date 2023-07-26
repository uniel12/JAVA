package ex0628;

public class Ex03실습1 {

	public static void main(String[] args) {

		// 1.문자열 데이터를 담을 수 있는 배열 arrStr 선언!
		// 2. 문자열 데이터 10를 담을 수 있는 배열 생성!
		String[] arrStr = new String[10];

		// 3. 0번 인덱스부터 차례대로 값 5개 넣기
		// -> JAVA, HTML, DB, PTYHON, CSS
		arrStr[0] = "JAVA";
		arrStr[1] = "HTML";
		arrStr[2] = "DB";
		arrStr[3] = "PTYHON";
		arrStr[4] = "CSS";

		// 4. for문 사용해서 배열값 출력
		for (int i = 0; i < arrStr.length; i++) {
			if (arrStr[i] != null) {
				System.out.print(arrStr[i] + " ");
			}
		}

	}

}
