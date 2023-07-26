package animal;

public class Chicken extends Bird {
	
	// walk() 메소드 재정의
	public void walk() {
		System.out.println("날지 못한다");
	}

	// egg() 메소드 구현하기 
	//source overriding Method
	
	@Override
	public void egg() {
		System.out.println("닭 알 낳기");
	}
	
	
	
	

}
