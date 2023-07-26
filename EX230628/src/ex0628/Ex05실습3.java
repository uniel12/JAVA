package ex0628;

public class Ex05실습3 {

	public static void main(String[] args) {
		
		// 1.정수형 배열을 임의로 초기화
		int[] arr = {3,2,5,8,6,12,7,4,10}; 
		int max = arr[0];
		// 배열의 값 중 가장 큰 값을 찾아 출력
		
		for(int i=0; i< arr.length; i++) {
			
			if (arr[i] > max) {
				max = arr[i];
			}
			
		}
		System.out.println("가장 큰 수는 "+ max +"입니다.");
		
		
//		if (arr[0] > max) {
//			max = arr[0];
//		} // max =3;
//		if (arr[1] > max) {
//			max = arr[1];
//		} // max =3;
//		if (arr[2] > max) {
//			max = arr[2];
//		} // max =5;
		
		
		
		
		
		
		
		

	}

}
