package 인터페이스;

public interface PokeMon {
	
	// 인터페이스는 프로젝트 지침서, 규칙, 설계만 되어있다
	// 추상메서드만 포함할 수 있다.
	
	final String name = "서윤";
	
	// 일반공격
	public abstract void atk();
	// 특수공격
	public abstract void specialAtk();
}
