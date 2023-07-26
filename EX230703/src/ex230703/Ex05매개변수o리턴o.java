package ex230703;

public class Ex05매개변수o리턴o {

	public static void main(String[] args) {

		// 더하는 메소드 호출하기
		add(8, 6);
		System.out.println(add(8,6));

	}

	public static int add(int i, int j) {
//		int result = i + j;
		return i+j;
	}

}
