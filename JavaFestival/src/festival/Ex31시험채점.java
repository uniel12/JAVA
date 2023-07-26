package festival;

import java.util.Scanner;

public class Ex31시험채점 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

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
				sum+= cnt;
			
			}
		}

		System.out.println(sum);

		sc.close();
	}

}
