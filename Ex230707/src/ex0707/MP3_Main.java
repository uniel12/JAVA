package ex0707;

import java.util.ArrayList;
import java.util.Scanner;
import javazoom.jl.player.MP3Player;

public class MP3_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 뮤직 객체 생성하기
		MP3 music1= new MP3("Anne Marie","2002",100,".\\music\\Anne Marie - 2002.mp3");
		MP3 music2= new MP3("Billie Elilish","bad guy",100,".\\music\\Billie Eilish - bad guy.mp3");
		MP3 music3= new MP3("Carmen Twillie, Leo M.","Circle of Life",300,".\\music\\Carmen Twillie, Lebo M. - Circle of Life.mp3");
		MP3 music4 = new MP3("CHUNG HA", "벌써 12시", 400, ".\\music\\CHUNG HA - 벌써 12시.mp3");
		MP3 music5 = new MP3("Idina Menzel", "Let It Go", 500, ".\\music\\Idina Menzel - Let It Go.mp3");
		MP3 music6 = new MP3("Itzy", "Dalla Dalla", 600, ".\\music\\Itzy - Dalla Dalla.mp3");
		MP3 music7 = new MP3("JENNIE", "SOLO", 700, ".\\music\\JENNIE - SOLO.mp3");
		MP3 music8 = new MP3("Mena Massoud, Naomi Scott", "A Whole New World", 750, ".\\music\\Mena Massoud, Naomi Scott - A Whole New World.mp3");
		MP3 music9 = new MP3("Rain", "깡", 800, ".\\music\\Rain - 깡.mp3");
		MP3 music10 = new MP3("Ring Ding Dong", "Ring Ding Dong", 900, ".\\music\\SHINee - Ring Ding Dong.mp3");
		MP3 music11 = new MP3("TWICE", "FANCY", 550, ".\\music\\TWICE - FANCY.mp3");
		MP3 music12 = new MP3("이하이", "NO ONE", 860, ".\\music\\이하이 - NO ONE.mp3");
		// 경로는 두가지 방법으로 불러올 수 있음
		// 절대 경로 : 다른 사람에게 재생 불가 복붙
		// C:\\Users\\smhrd\\Desktop\\JavaStudy\\Ex230707\\music\\Anne Marie - 2002.mp3
		// 상대 경로 : 위에서 사용한 방식
		// .\\music\\Anne Marie - 2002.mp3
		
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
		
		//list. get(0).getTitle()
		
	
		// 틀만들기
		// 1번 누르면 재생
		// 2번 누르면 정지
		// 3번 누르면 이전곡
		// 4번 누르면 다음곡
		// 5번 누르면 종료 -> "플레이어를 종료합니다!!" 출력하고 종료
		int index=0;
		MP3Player mp3 = new MP3Player();
		
		while(true) {
		System.out.print("[1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]종료 >>");
		int menu = sc.nextInt();
		if(menu == 1) {
			// 재생
			// 여자아이들 - 퀸카(100초)(임의)
			String singer= list.get(index).getSinger(); 
			String title = list.get(index).getTitle();
			int playTime = list. get(index).getPlayTime();
			
			System.out.printf("%s - %s(%d초)%n",singer,title,playTime);
			mp3.play(list.get(index).getPath());
			
				
		}else if(menu ==2) {
			// 정지
			mp3.stop();
		}else if(menu == 3) {
			// 이전곡
			if(mp3.isPlaying()) {
				mp3.stop();
			}
			index--;
			
			if(index < 0) {
				index=list.size()-1;
			}
			
			String singer= list.get(index).getSinger(); 
			String title = list.get(index).getTitle();
			int playTime = list. get(index).getPlayTime();
			
			System.out.printf("%s - %s(%d초)%n",singer,title,playTime);
			mp3.play(list.get(index).getPath());
			
		}else if (menu ==4) {
			// 다음곡
			if(mp3.isPlaying()) {
				mp3.stop();
			}
			index++;
			if(index >= list.size()) {
				index=0;
			}
			
			String singer= list.get(index).getSinger(); 
			String title = list.get(index).getTitle();
			int playTime = list. get(index).getPlayTime();
			
			System.out.printf("%s - %s(%d초)%n",singer,title,playTime);
			mp3.play(list.get(index).getPath());
			
			
		}else if (menu == 5){
			//종료
			mp3.stop();
			System.out.println("플레이어를 종료합니다!!");
			break;
		}
		
		
		// player 외부파일 프로젝트 우클릭 해서 Build path 
		// configure Build path 클릭 -> add_ExtenerJ~ g해서 가져오고
		// music 폴더 만들기 -> 음악 드래그 해서 가져오기
		// 경로를 가져오기 위해서 설계도 클래스로 다시 가서 만들기
		// 필드 새로 만들고 생성자 메소드에 추가 새로운 필드의 getter 메소드 만들기
		
		}
		sc.close();
	}

}
