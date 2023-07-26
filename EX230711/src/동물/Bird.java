package 동물;

public class Bird extends Animal {
	
	// 먹고 , 자고 움직인다.
	// 움직이다. --->날다
	
	// 움직이다라는 기능을 오버라이딩을 통해 날 수 있도록 바꿔주자!
	//alt +shift + s -> Override/Implement Methods
	
	// + 알을 낳을 수 있다!
	public void egg() {
		System.out.println("알을 낳는다");
	}
	
	@Override
	public void move(){
		System.out.println("난다");
	}
	
}
