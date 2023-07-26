package ex0629;

import java.util.Scanner;

public class Ex01실습1 {

	public static void main(String[] args) {

		// 팀원의 이름을 담아 String 형태의 team 배열 초기화
		// 이름을 입력받아 몇번쨰 인덱스에 있는지 출력
		Scanner sc = new Scanner(System.in);

		String[] team = { "이주희", "이은비", "박수현", "나예호" };

		System.out.print("이름 : ");
		String name = sc.next();

		for (int i = 0; i < team.length; i++) {
			
			if (name.equals(team[i])) {
				System.out.print(name + "님은 " + i + "번 인덱스에 있습니다.");
				break;
			}
		}

		sc.close();

	}

}
