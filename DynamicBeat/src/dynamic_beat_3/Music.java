package dynamic_beat_3;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Music extends Thread { // Tread 하나의 작은 프로그램
	
	private Player player;
	private boolean isLoop; // 현재 곡이 무한반복인지 아님 한번만 재생되고 꺼지는지
	private File file;
	private FileInputStream fis; 
	private BufferedInputStream bis;
	
	// 생성자
	public Music(String name, boolean isLoop) {
		try {
			this.isLoop=isLoop; // 초기화
			file = new File(Main.class.getResource("../music/"+ name).toURI()); 
			//music 폴더 안에 해당 이름의 파일을 실행 .toURL()로 파일의 해당 위치를 가져옴
			fis = new FileInputStream(file);
			bis= new BufferedInputStream(fis);
			player = new Player(bis);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
	// 메소드
	public int getTime() {
		// 실행되는 음악의 현재 재생 시간을 알려줌
		if(player == null)
			return 0;
		return player.getPosition();
	}
	public void close() {
		isLoop = false;
		player.close();
		this.interrupt(); //Tread를 중지 상태로 만드는 것
	}
 
	@Override
	public void run() {
		// Thread 상속 받으면 무조건 상속 받아야하는 것
	try {
		// isLoop 값이 true라면 무한 반복
		do {
			player.play();
		}while(isLoop);
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
		
	}
	
	


		
	}

