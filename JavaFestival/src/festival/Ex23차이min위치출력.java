package festival;

public class Ex23차이min위치출력 {

	public static void main(String[] args) {

		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		//변수 선언하기
		int temp = 0;
		int distance = point[0] - point[1];
		int a = 0;
		int b = 0;
		
		for (int k = 0; k < point.length - 1; k++) {
			
			for (int i = 1; i < point.length; i++) {
				if (k != i) {
					if (point[k] > point[i]) {
						temp = point[k] - point[i];
						if (distance > temp) {
							distance = temp;
							a = k;
							b = i;
						}
					} else {
						temp = point[i] - point[k];
						if (distance > temp) {
							distance = temp;
							a = k;
							b = i;
						}
					}
				}
			}
		}
		System.out.println("result = [" + a + ", " + b + "]");

//		int temp =0;
//		int minIndex=0;

	

		// 참고 사항 ) 선택정렬
//		// 최종
//		int[] array = {7, 98, 13, 70, 24};
//		
//		
//		for (int k=0; k< array.length; k++) {
//		int maxIndex = k;
//		
//		for(int i = k+1; i < array.length; i++) {
//			if(array[i] > array[maxIndex]) {
//				maxIndex= i;
//			}
//		}
//		// 위치 서로 치환하기
//		int temp = array[k];
//		array[k] = array[maxIndex];
//		array[maxIndex]=temp;
//		
//		}
//		System.out.println(Arrays.toString(array));

	}
}
//			a[k]	a[i]
//	1사이클 : a[0]	a[1]
//			a[0]	a[2]
//			a[0]	a[3]
//			a[0]	a[4]
//			a[0]	a[5]
//			a[0]	a[6]
//		
//	2사이클 : a[1]	a[2]
//			a[1]	a[3]	 
//			a[1]	a[4]	
//			a[1]	a[5]	 
//			a[1]	a[6]	
//					
//	3사이클 : a[2]	a[3]
//			a[2]	a[4]	
//			a[2]	a[5]	 
//			a[2]	a[6]	
//					
//	4사이클 : a[3]	a[4]
//			a[3]	a[5]	 
//			a[3]	a[6]	
//
//	5사이클 : a[4]	a[5]
//			a[4]	a[6]	 
//
//	6사이클 : a[5]	a[6]
