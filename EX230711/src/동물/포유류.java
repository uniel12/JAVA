package 동물;

public class 포유류 extends Animal {
	
	// 추상 메서드를 상속받는 자식 클래스는
	// 반드시 추상 메서드를 구현해야한다!

	@Override
	public void move() {
		System.out.println("네발로 움직인다");
		
	}


}
