package festival;

import java.util.Arrays;

public class Ex24성적별학생수 {

	public static void main(String[] args) {
		// 성적별 학생수

		String score = "A,A,B,C,D,A,C,D,D,D,F";
		// .split("특정 문자" -> 특정문자를 기준으로 문자열을 잘라주는 함수(기능)
		String[] arr = score.split(",");

		System.out.println(Arrays.toString(arr));

		int a = 0; // A를 카운트
		int b = 0; // B를 카운트
		int c = 0; // C를 카운트
		int d = 0; // D를 카운트
		int f = 0; // F를 카운트

		for (String s : arr) {

			if (s.equals("A")) {
				a++;
			} else if (s.equals("B")) {
				b++;
			} else if (s.equals("C")) {
				c++;
			} else if (s.equals("D")) {
				d++;
			} else if (s.equals("F")) {
				f++;
			}

		}

		System.out.println(
				"A :" + a + "명 \n" + "B :" + b + "명\n" + "C :" + c + "명\n" + "D :" + d + "명\n" + "F :" + f + "명\n");

//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i].equals("A")) {
//				a ++;
//			} else if (arr[i].equals("B")) {
//				b ++;
//			} else if (arr[i].equals("C")) {
//				c ++;
//			} else if (arr[i].equals("D")) {
//				d ++;
//			} else if (arr[i].equals("F")) {
//				f ++;
//			}
//		}

//		System.out.println("A: "+a+"명");
//		System.out.println("B: "+b+"명");
//		System.out.println("C: "+c+"명");
//		System.out.println("d: "+d+"명");
//		System.out.println("f: "+f+"명");

	}

}
