package JavaFes;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 1.입력하는 도구 가져오기
		// 2. 사용자한테 o,x 문자열 입력받기
		// 3. ooooxoo 분리 ----->""split
		// 4. 배열에 들어가있는 값이 o인지 x인지 판단
		// 총합이 저장될 변수, 점수가 변하는 수 변수 0부터 +1씩 증가
		// +1씩 증가해서 누적되는 경우o
		// 0 ---->x
		// o인지 x인지 판단!

		System.out.println("==== 채점하기 ====");
		String ox = sc.next();

		String[] str = ox.split("");

		int sum = 0; // 점수
		int cnt = 0; // o횟수

		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("o")) {
				cnt++;
				sum += cnt;
				
			} else {
				cnt = 0;
			}
		}

		System.out.println(sum);

		sc.close();
		
		
		
		
		
		
		
		
	}

}
