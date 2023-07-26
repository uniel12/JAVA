import java.util.ArrayList;
import java.util.Scanner;

public class AddressMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 연락처 객체를 담을 수 있는 리스트 작성하기
		ArrayList<Address> list = new ArrayList<Address>();
		// 리스트에 연락처 담아주기

		int index = 0;

		while (true) {
			System.out.print("[1]추가 [2]전체조회 [3]삭제 [4]검색 [5]종료 >>");
			int menu = sc.nextInt();
			if (menu == 1) {
				// 추가
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("전화번호 : ");
				String phoneNumber = sc.next();

				Address add = new Address(name, age, phoneNumber);
				list.add(add);
				System.out.println("추가가 완료되었습니다.");

			} else if (menu == 2) {
				// 전체조회
				if (list.size() == 0) {
					System.out.println("등록된 연락처가 없습니다.");
				}
				for (int i = 0; i < list.size(); i++) {

					String name = list.get(i).getName();
					int age = list.get(i).getAge();
					String phoneNumber = list.get(i).getPhonNumber();
					System.out.printf(i + 1 + ". %s(%d) : %s %n", name, age, phoneNumber);
				}
				
			} else if (menu == 3) {
				// 삭제
				if (list.size() == 0) {
					System.out.println("등록된 연락처가 없습니다.");
				} else {
					for (int i = 0; i < list.size(); i++) {

						String name = list.get(i).getName();
						int age = list.get(i).getAge();
						String phoneNumber = list.get(i).getPhonNumber();
						System.out.printf(i + 1 + ". %s(%d) : %s %n", name, age, phoneNumber);
					}
					System.out.print(" 삭제할 번호 입력 : ");
					index = sc.nextInt();
					list.remove(index - 1);
					System.out.println(index + "번이 삭제 되었습니다.");
				}
			} else if (menu == 4) {
				// 검색
				
				System.out.print("검색할 이름 입력 : ");
				String insult = sc.next();
				boolean check = true;
				
				for (int i = 0; i < list.size();i++) {
					
					if (insult.equals(list.get(i).getName())) {
						
						String name = list.get(i).getName();
						int age = list.get(i).getAge();
						String phoneNumber = list.get(i).getPhonNumber();
						System.out.printf(i + 1 + ". %s(%d) : %s %n", name, age, phoneNumber);
						
						check = false;
					}
					
				}
				if(check == true) {
					System.out.println("검색한 이름의 정보가 없습니다.");
				}
				
			} else if (menu == 5) {
				// 종료
				System.out.println("연락처 프로그램 종료합니다!!");
				break;
			}

		}
		sc.close();
	}
}