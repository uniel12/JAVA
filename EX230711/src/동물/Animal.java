package 동물;

public abstract class Animal {
	
	//  추상클래스 : 추상메서드가 정의되어 있는 클래스
	// 1. 반드시 추상클래스가 되어야한다!
	//  +) 추상클래스는 일반메서드들만도 포함할 수 있다
	// 2. 추상클래스는 객체로 생성 할 수 없다!
	// -> 불완전한 프로그램이기 떄문
	// 3. 추상 메서드를 상속받는 자식 클래스는
	//    반드시 추상 메서드를 구현해야한다!
	
	// 먹고, 자고, 움직인다.
	public void eat(){
		System.out.println("먹는다");
	}
	public void sleep(){
		System.out.println("잔다");
	}
	// 추상 메서드
	// abstract : 추상 키워드
	public abstract void move();
}
	// 추상클래스 추상 메서드 : 
	// 상속관계에서 서브 클래스가 반드시 구현해야함을 알릴때(강제성)

