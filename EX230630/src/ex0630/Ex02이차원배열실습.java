package ex0630;

import java.util.Scanner;

public class Ex02이차원배열실습 {

	public static void main(String[] args) {

		// 입력하는 도구 가져오기
		Scanner sc = new Scanner(System.in);
		// 3행 5열 이차원배열 만들기 -> answer
		int[][] answer = { { 4, 5, 4, 1, 2 }, { 0, 0, 0, 0, 0 }, { 10, 20, 30, 20, 20 } };

		// 5번 동작하는 for문 작성
		for (int i = 0; i < answer[1].length; i++) {

			System.out.print(i + 1 + "번째 답 >> ");
			answer[1][i] = sc.nextInt();
		}
		// 0행과 1행이 일치하는지 판단한 다음 X/O 출력
		// [0]행 -> 답
		// [1]행 -> 입력한 값
		// [2]행 -> 배점
		int sum = 0; // 정답이 맞았을 때 sum에다가 배점을 누적!

		for (int i = 0; i < answer[1].length; i++) {

			if (answer[1][i] == answer[0][i]) {

				System.out.print("O"+"\t");
				sum += answer[2][i];
			} else {
				System.out.print("X"+"\t");
			}
			
		}

		System.out.println("\n총점 : " + sum + "점");

		sc.close();
	}

}
