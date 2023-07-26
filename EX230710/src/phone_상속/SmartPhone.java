package phone_상속;

public class SmartPhone extends Phone {
	
	
	
	
	// 재정의 - 오버라이딩
	@Override  //어노테이션?
	public void call() {
		System.out.println("영상통화걸기~");
	}
	
	
	public void music() {
		System.out.println("음악재생하기~");
	}
	public void intenet() {
		System.out.println("인터넷하기~");
	}

}
