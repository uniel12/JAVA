package ex0707;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03MusicList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> musiclist = new ArrayList<String>();

		System.out.println("==== Music Play List ====");
		while (true) {
			System.out.print("[1]노래추가 [2] 노래조회 [3] 노래삭제 [4]종료 >>");
			int menu = sc.nextInt();

			if (menu == 1) {
				// 노래추가
				System.out.print("[1]원하는 위치에 추가 [2]마지막 위치에 추가>>");
				int num = sc.nextInt();

				if (num == 1) {
					System.out.print("추가할 위치 : ");
					int index = sc.nextInt();
					System.out.print("추가할 제목 : ");
					String title = sc.next();

					musiclist.add(index - 1, title);
					System.out.println("추가가 완료되었습니다.");
				} else {
					System.out.print("추가할 제목 : ");
					String title = sc.next();

					musiclist.add(title);
					System.out.println("추가가 완료되었습니다.");
				}

			} else if (menu == 2) {
				// 노래 조회
				System.out.println("====현재 재생 목록====");
				if (musiclist.size() == 0) {
					System.out.println("재생목록이 없습니다.");
				} else {
					for (int i = 0; i < musiclist.size(); i++) {
						System.out.println((i + 1 + ". " + musiclist.get(i)));
					}

				}
			} else if (menu == 3) {
				System.out.print("[1]선택삭제 [2]전체 삭제 >>");
				int num = sc.nextInt();

				if (num == 1) {
//					if (musiclist.size() == 0) {
//						System.out.println("삭제할 목록이 없습니다.");
//					} else {
					System.out.print("삭제할 번호 : ");
					int index = sc.nextInt();
					musiclist.remove(index - 1);
					System.out.println(index + "번 노래가 삭제되었습니다~");

//						System.out.print("삭제할 노래 제목 입력 : ");
//						String name = sc.next();
//						musiclist.remove(name);
//						for(int i =0; i< musiclist.size();i++) {
//							if(musiclist.get(i).equals(name)) {
//								musiclist.remove(musiclist.get(i));
//							}
//						}
//						System.out.println("삭제가 완료되었습니다.");
//					}
				} else {
					musiclist.clear();
					System.out.println("전체삭제 성공!");
				}

			} else {
				// 종료
				System.out.println("프로그램 종료!");
				break;
			}
		}
sc.close();
	}

}
