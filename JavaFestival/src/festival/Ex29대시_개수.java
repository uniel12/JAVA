package festival;

import java.util.Scanner;

public class Ex29대시_개수 {

	public static void main(String[] args) {

		// 0 1 2 3 4 5 6 7 8 9
		// 6 2 5 5 4 5 6 3 7 6
		Scanner sc = new Scanner(System.in);

		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		String num = sc.next();

		String[] str = num.split("");
		// 그냥 추가한 부분
		if (str[0].equals("0")) {
			System.out.println("다시 실행해주세요.");
		} else {

		int sum = 0;
		
			for (int i = 0; i < str.length; i++) {
				switch (str[i]) {
				case "0":
				case "6":
				case "9":
					sum += 6;
					break;
				case "2":
				case "3":
				case "5":
					sum += 5;
					break;
				case "1":
					sum += 2;
					break;
				case "4":
					sum += 4;
					break;
				case "7":
					sum += 3;
					break;
				case "8":
					sum += 7;
					break;
				}
			}
			System.out.println("대시('-')의 총 합 >> " + sum);
		}
		sc.close();
	}
}
