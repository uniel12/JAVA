package ex클래스_객체;

public class Contact {

	// 필드
	private String name; // public은 자동적으로 생략되어 있음
	private int age; // 따라서 Main 클래스에서 당연히 접근 가능
	private String tel; // 그걸 접근 못하게 하는게 private
	private String address;

	// 생성자 메소드
	public Contact(String name, int age, String tel, String address) {
		super();
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.address = address;
	}

	public String getName() {  // getter메소드
		return name;
	}

	public void setName(String name) { // setter메소드
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}