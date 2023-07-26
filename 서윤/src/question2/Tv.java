package question2;

public class Tv {
	int channel = 0;
	String color = "";

	// 메소드 channelUp(), channelDown(), print()
	public void channelUp() {
		channel++;
	}

	public void channelDown() {
		channel--;
	}

	public void print() {
		System.out.println("Tv의 현재채널은 : " + channel + "이고, Tv의 색깔은 " + color + " 입니다.");
	}

	// 생성자 메소드
	public Tv(int channel, String color) {
		super();
		this.channel = channel;
		this.color = color;
	}

	// 기본 생성자 메소드
	public Tv() {

	}
}
