package animal;

public class Animal {

	// public으로 쓰기에는 캡슐화에 위배
	protected String name;

	// 동물이라면 먹는 행위는 무조건 해야함!
	public void eat() {
		System.out.println("먹는다.");
	};

}
