package ex0707;


import java.util.ArrayList;
import java.util.Scanner;

public class Ex02Team {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> team = new ArrayList<String>();

		// 팀원의 수만큼 입력받아서 ArrayList(team)에 저장
		for (int i = 0; i < 5; i++) {
			System.out.print("이름을 입력하세요 : ");
//			String name = sc.next();
			team.add(sc.next());

		}
		// 팀원 출력하기
		System.out.print("팀원 이름은 ");
		for (int i = 0; i < team.size(); i++) {
			System.out.print(team.get(i) + " ");
		}
		System.out.println("입니다.");

		// 팀원 퇴출시키기
		System.out.print("퇴출시킬 이름 입력 : ");
		String name = sc.next();

		// 입력 받은 이름이 ArrayList에 있다면 해당하는 이름 삭제

//		team.remove(name);
		for (int i = 0; i < team.size(); i++) {
			if (name.equals(team.get(i))) {
				team.remove(i);
			}
		}

		// 팀원 이름 출력하기
		System.out.print("팀원 이름은 ");
		for (int i = 0; i < team.size(); i++) {
			System.out.print(team.get(i) + " ");
		}
		System.out.print("입니다.");
		
	sc.close();
	}
}
