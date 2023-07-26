package 동물;

public class Penguin extends Bird {
	
	@Override
	public void move(){
		System.out.println("헤엄친다");
	}
	// 먹고, 자고, 움직임 (날다 ----->헤엄치다),앟낳는다

	public void sliding(){
		System.out.println("슬라이딩한다");
	}
	//+)슬라이딩한다
}
