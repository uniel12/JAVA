package ex0630;

public class Ex03치환 {

	public static void main(String[] args) {
		
		String 오른손 = "물병";
		String 왼손 = "볼펜";
		
		System.out.println("오른손에는 " + 오른손);
		System.out.println("왼손에는 " + 왼손);
		
		String temp =""; //빈상자--임시 변수
		
		// 1. 오른손에 있는 물병을 책상에 놓는다.
		temp = 오른손; 
		
		// 2. 왼손에 있는 물병을 오른손에 준다.
		오른손 = 왼손;
		// 3. 책상에 있는 물병을 왼손이 잡는다.
		왼손 = temp;
		System.out.println("====교환 후====");
		System.out.println("오른손에는 " + 오른손);
		System.out.println("왼손에는 " + 왼손);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
