package 인터페이스;

public class Pica implements PokeMon{
	

	@Override
	public void atk() {
		System.out.println("몸통박치기");
	}

	@Override
	public void specialAtk() {
		System.out.println("백만볼트");
	}
	
	// 인터페이스를 상속할 때는 implements(구현)
	// - 다중 상속 가능하도록 설계되어 있다
	//   -> 기능확장이 용이하도록 만들었기 때문
	
	// cf) 상속은 다중 상속불가
	
}
