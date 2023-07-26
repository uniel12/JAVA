package animal;

// Animal 클래스 상속 -> extends
// 추상메소드를 하나라도 가지고 있으면 추상클래스
public abstract class Bird extends Animal {

	// 하위, 서브, 자식 클래스
	
	//walk() ->"날기"
	// 재정의 = 오버라이딩
	// 오버라이딩의 특징
	// 메소드 이름 동일, 매개변수 개수와 데이터 타입 동일, 리턴타입 동일
	@Override
	public void walk() {
		System.out.println("날기");
	}
	// 조류라면 무조건 가지고 있는 특징
	// body가 없는 추상메소드
	// 상위 클래스의 메소드(기능)을 무조건 구현시키고 싶을때
	public abstract void egg();
	
}
