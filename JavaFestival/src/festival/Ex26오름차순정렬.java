package festival;

import java.util.Arrays;
import java.util.Scanner;

public class Ex26오름차순정렬 {

	public static void main(String[] args) {
		// bubleSort

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
	
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 수 입력 : ");
			arr[i] = sc.nextInt();
		}

		System.out.println("정렬 후");
		
		for (int k = 1; k < arr.length; k++) {
			for (int i = 0; i < arr.length - k; i++) {

				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}

			}
		}
		
		System.out.println(Arrays.toString(arr));
		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i] > arr[j]) { //오름차순
//					int tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(arr[i]);
//			if(i+1 != arr.length) {
//				System.out.print(" ");
//			}
//		}
		sc.close();
	}

}



//for(int i=0; i<arr.length; i++) {
//	for(int j=i+1; j<arr.length; j++) {
//		if(arr[i] < arr[j]) { //내림차순
//			int tmp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = tmp;
//		}
//	}
//}
//
//for(int i=0; i<arr.length; i++) {
//	System.out.print(arr[i]);
//	if(i+1 != arr.length) {
//		System.out.print(", ");
//	}
//}
//}
//}