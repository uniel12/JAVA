package controller;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;
import music.Bgm;

public class Mp3 {

	MP3Player mp3 = new MP3Player();

	ArrayList<Bgm> mlist = new ArrayList<Bgm>();

	public Mp3() {

		Bgm b1 = new Bgm("와우효과음", ".\\music\\와우효과음.mp3");
		Bgm b2 = new Bgm("무궁화2", ".\\music\\무궁화2.mp3");
		Bgm b3 = new Bgm("메인브금", ".\\music\\메인브금.mp3");
		Bgm b4 = new Bgm("딱지치기공유버전", ".\\music\\딱지치기공유버전.mp3");
		Bgm b5 = new Bgm("달고나부서지는소리", ".\\music\\달고나부서지는소리.mp3");
		Bgm b6 = new Bgm("뺨2", ".\\music\\뺨2.mp3");
		Bgm b7 = new Bgm("딱지치기공유버전", ".\\music\\딱지치기공유버전.mp3");
		Bgm b8 = new Bgm("무궁화총소리", ".\\music\\무궁화총소리.mp3");
		Bgm b9 = new Bgm("지하철2", ".\\music\\지하철2.mp3");
		Bgm b10 = new Bgm("발자국2", ".\\music\\발자국2.mp3");
		Bgm b11 = new Bgm("승합차2", ".\\music\\승합차2.mp3");
		Bgm b12 = new Bgm("무궁화멘트2", ".\\music\\무궁화멘트2.mp3");
		Bgm b13 = new Bgm("달고나멘트2", ".\\music\\달고나멘트2.mp3");
		Bgm b14 = new Bgm("징검다리멘트2", ".\\music\\징검다리멘트2.mp3");
		Bgm b15 = new Bgm("환호", ".\\music\\환호.mp3");
		
		

		mlist.add(b1);
		mlist.add(b2);
		mlist.add(b3);
		mlist.add(b4);
		mlist.add(b5);
		mlist.add(b6);
		mlist.add(b7);
		mlist.add(b8);
		mlist.add(b9);
		mlist.add(b10);
		mlist.add(b11);
		mlist.add(b12);
		mlist.add(b13);
		mlist.add(b14);
		mlist.add(b15);
	}

	public Bgm fx(int index) {
		if (mp3.isPlaying()) {// 노래 멈추기
			mp3.stop();
		}
		// 브금 재생
		mp3.play(mlist.get(index).getPath());

		return mlist.get(index);
	}
	public void stp(int index) {
		if (mp3.isPlaying()) {// 노래 멈추기
			mp3.stop();
		}
	}
	public boolean isPlaying() {
		boolean a = false;
		if(mp3.isPlaying()) {
			a = true;
		}
		return a;
	}
	

	public void bgm() {
		// 노래 멈추기
		// 브금 재생

	}

	public void main() {
		// 노래 멈추기
		// 브금 재생

	}

}
