package dynamic_beat_1;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame { // JFrame 그래픽 게임 만드려면 필요한 클래스
	
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT); // 게임창의 크기
		setResizable(false); // 한번 만들어진 게임창은 사용자가 인위적으로 조정불가
		setLocationRelativeTo(null); //  실행시 게임창 정중앙 위치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 게임창 종료할 때 프로그램 종료
		setVisible(true); // 게임창을 눈에 보이게 해줌
		
	}

}
