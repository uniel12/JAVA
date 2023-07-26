package ex0706오전;

public class Tv {

	int channel=0;
	String color="";
	
	//메소드 channelUp(), channelDown()
	public  void channelUP() {
		channel ++;
	}
	public  void channelDown() {
		channel --;
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