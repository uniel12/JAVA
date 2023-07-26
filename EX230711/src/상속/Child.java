package 상속;

public class Child extends Parent {

	// 자식, 서브 , 하위 클래스
	
	// 재정의 - 오버라이딩
	// 메소드 이름 동일, 매개변수 개수 및 데이터타입 동일, 리턴타입 동일
	
	// 안에 변수를 넣으면 새로운 메소드(오버라이드 아님)
	//annotation -> 기능을 하는 주석
	@Override 
	public void makeTteokbokki() {
		System.out.println("맛있게 치즈떡볶이 만들기~");
	}
	
	public void makeFry() {
		System.out.println("맛있게 튀김 만들기~");
	}
	
	
	
	
	
	// 오버라이딩 재정의 : 부모클래스의 메소드의 동작방법을 변경
	// 오버로딩 중복정의 : 같은 이름, 다른 매개변수의 메소드를 여러 개 만듬
	
	
	
	
}
