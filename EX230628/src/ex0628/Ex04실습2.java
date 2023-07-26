package ex0628;

public class Ex04실습2 {

	public static void main(String[] args) {
		
		// 1. 임의의 값으로 배열 초기화->{} 사용
		int[] intArray = {1,2,3,4,5,6,7,8,9,10};
		// 2. 배열 값 중 홀수만 출력, 홀수의 개수도 출력하는 프로그램을 작성
//		System.out.print("intArray에 들어있는 홀수는 ");
		int count=0;
		String odd ="";
		for(int i=0; i < intArray.length; i++) {
			
			if(intArray[i]%2==1) {
				count++;
				odd += intArray[i] +" ";
//				System.out.print(intArray[i]+" ");
			}
			
		}
		System.out.println("intArray에 들어있는 홀수는 "+odd
				+"입니다. 홀수의 총 개수는 "+count+"개 입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
