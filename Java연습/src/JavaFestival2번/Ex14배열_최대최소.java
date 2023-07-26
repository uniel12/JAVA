package JavaFestival2번;

import java.util.Random;

public class Ex14배열_최대최소 {

	public static void main(String[] args) {
		// 8칸 크기의 배열을 선언하고 랜덤수로 초기화 한 후
		// 가장 큰 수와 가장 작은 수를 각각 출력
		Random rd = new Random();
		
		int arr[] = new int[8];
		int max = 0;
		int min = 0;

		System.out.print("배열에 있는 모든 값 : ");
		
		for(int i=0; i<arr.length; i++ ) {
			 arr[i] = rd.nextInt(100)+1;

	            if(i==0) {

	                max = arr[i];

	                min = arr[i];
			
		}
	            if(max>arr[i]) max = arr[i];

	            if(min<arr[i]) min = arr[i];
	            
	            System.out.print(arr[i]+"\t");

        }

        System.out.println();
		System.out.println("가장 큰 값 : "+ max);
		
		System.out.println("가장 작은 값 : "+ min);
		
		
//        // Random 객체 생성
//        Random random = new Random();
//
//        // 0부터 100 사이의 랜덤 정수 생성
//        int randomNumber = random.nextInt(100);
//
//        // 랜덤 정수 출력
//        System.out.println("생성된 랜덤 정수: " + randomNumber);
		
//        Random r = new Random();
//
//        
//
//        int[] arr = new int[8];
//
//        int max = 0;
//
//        int min = 0;
//
//        System.out.print("배열에 있는 모든 값 : ");
//
//        for(int i=0; i<arr.length; i++) {
//
//            arr[i] = r.nextInt(100)+1;
//
//            if(i==0) {
//
//                max = arr[i];
//
//                min = arr[i];
//
//            }
//
//            
//
//            if(max>arr[i]) max = arr[i];
//
//            if(min<arr[i]) min = arr[i];
//
//            
//
//            System.out.print(arr[i]+"\t");
//
//        }
//
//        System.out.println();
//
//        System.out.println("가장 큰 값 "+max);
//
//        System.out.println("가장 작은 값 "+min);
	}

}
