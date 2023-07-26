
public class Address {
	// 필드 선언
	private String name;
	private int age;
	private String phonNumber;
	
	// 생성자 메소드
	public Address(String name, int age, String phonNumber) {
		super();
		this.name = name;
		this.age = age;
		this.phonNumber = phonNumber;
	}
	// getter 메소드
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getPhonNumber() {
		return phonNumber;
	}
	
	
	
	
}
