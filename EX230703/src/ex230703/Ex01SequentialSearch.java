package ex230703;

public class Ex01SequentialSearch {

	public static void main(String[] args) {
		
		int []array = {13, 35, 15, 11, 26, 72, 26, 78, 19, 61, 90};
		
		//내가 찾고 싶은 데이터
		int search = 78;
		
		// 방법1) 쉬운 방법이지만 효율이 떨어짐
		for (int i = 0; i < array.length; i++) {
			
			if(search == array[i] ) {
				System.out.println(search + "는 "+i+"번 째 인덱스 입니다.");
			}
			
		}
		
		
		
		
		
		
		
		

	}

}
