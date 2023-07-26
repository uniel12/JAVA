import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MP3_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		// 뮤직 객체 생성하기
		MP3 music1 = new MP3("Anne Marie", "2002", 100, ".\\music\\Anne Marie - 2002.mp3");
		MP3 music2 = new MP3("Billie Elilish", "bad guy", 100, ".\\music\\Billie Eilish - bad guy.mp3");
		MP3 music3 = new MP3("Carmen Twillie, Leo M.", "Circle of Life", 300,".\\music\\Carmen Twillie, Lebo M. - Circle of Life.mp3");
		MP3 music4 = new MP3("CHUNG HA", "벌써 12시", 400, ".\\music\\CHUNG HA - 벌써 12시.mp3");
		MP3 music5 = new MP3("Idina Menzel", "Let It Go", 500, ".\\music\\Idina Menzel - Let It Go.mp3");
		MP3 music6 = new MP3("Itzy", "Dalla Dalla", 600, ".\\music\\Itzy - Dalla Dalla.mp3");
		MP3 music7 = new MP3("JENNIE", "SOLO", 700, ".\\music\\JENNIE - SOLO.mp3");
		MP3 music8 = new MP3("Mena Massoud, Naomi Scott", "A Whole New World", 750,".\\music\\Mena Massoud, Naomi Scott - A Whole New World.mp3");
		MP3 music9 = new MP3("Rain", "깡", 800, ".\\music\\Rain - 깡.mp3");
		MP3 music10 = new MP3("Ring Ding Dong", "Ring Ding Dong", 900, ".\\music\\SHINee - Ring Ding Dong.mp3");
		MP3 music11 = new MP3("TWICE", "FANCY", 550, ".\\music\\TWICE - FANCY.mp3");
		MP3 music12 = new MP3("이하이", "NO ONE", 860, ".\\music\\이하이 - NO ONE.mp3");
		

		// 음악 객체를 담을 수 있는 음악 리스트 만들기
		ArrayList<MP3> list = new ArrayList<MP3>();

		// 리스트에 음악 넣어주기
		list.add(music1);
		list.add(music2);
		list.add(music3);
		list.add(music4);
		list.add(music5);
		list.add(music6);
		list.add(music7);
		list.add(music8);
		list.add(music9);
		list.add(music10);
		list.add(music11);
		list.add(music12);
		

		// 틀만들기
		// 1번 누르면 재생
		// 2번 누르면 정지
		// 3번 누르면 이전곡
		// 4번 누르면 다음곡
		// 5번 누르면 종료 -> "플레이어를 종료합니다!!" 출력하고 종료
		int index = 0;
		MP3Player mp3 = new MP3Player();
		while (true) {
			System.out.print("[1]재생 [2] 정지 [3]이전곡 [4] 다음곡 [5] 셔플 [6] 종료>>");
			int menu = sc.nextInt();
			// 재생
			if (menu == 1) {
				String singer = list.get(index).getSinger();
				String title = list.get(index).getTitle();
				int playTime = list.get(index).getPlayTime();

				System.out.printf("%s-%s(%d초)%n", singer, title, playTime);
				mp3.play(list.get(index).getPath());
				
				// 정지
			} else if (menu == 2) {
				mp3.stop();
				

				// 이전곡
			} else if (menu == 3) {
				if (mp3.isPlaying()) {
					mp3.stop();
				}
				index--;
				if (index < 0) {
					index = list.size() - 1;
				}

				String singer = list.get(index).getSinger();
				String title = list.get(index).getTitle();
				int playTime = list.get(index).getPlayTime();
				System.out.printf("%s-%s(%d초)%n", singer, title, playTime);
				mp3.play(list.get(index).getPath());

				// 다음곡
			} else if (menu == 4) {
				if (mp3.isPlaying()) {
					mp3.stop();
				}
				index++;
				if (index >= list.size()) {
					index = 0;
				}

				String singer = list.get(index).getSinger();
				String title = list.get(index).getTitle();
				int playTime = list.get(index).getPlayTime();

				System.out.printf("%s-%s(%d초)%n", singer, title, playTime);
				mp3.play(list.get(index).getPath());
				
				// 셔플
			} else if(menu == 5) {
				mp3.stop();
				
				index= rd.nextInt(12);
				
				String singer = list.get(index).getSinger();
				String title = list.get(index).getTitle();
				int playTime = list.get(index).getPlayTime();

				System.out.printf("%s-%s(%d초)%n", singer, title, playTime);
				mp3.play(list.get(index).getPath());
				
				
				// 종료
			} else if (menu == 6) {
				mp3.stop();
				System.out.println("플레이어를 종료합니다!!");
				break;
			}

		}
		sc.close();
	}

}
