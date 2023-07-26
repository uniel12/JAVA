package JavaFes;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		
		//<-----------
		Scanner sc = new Scanner(System.in);
		// str=" 01001101"
		// str을 split을 사용해서 각 숫자 하나하나를 배열에 저장
		String str =sc.next();
		String []arr = str.split("");
		//[0]-0 [1]-1
		
		//문자열 ---->숫자
		//int num = Integer.parsrInt(str)
		
		// 2의 승     인덱스
		// 0~7 +1,   7-0 -1
		int sum =0;
		int pow = 1;
		for(int i = str.length()-1; i>=0; i--){
			int num = Integer.parseInt(arr[i]);
//			sum += (Math.pow(2,7-i)*num);
			sum += pow*num;
			pow*=2;
		}
		System.out.println(sum);
		
		
		
		
		// sum += 2^0*arr[7]
		// sum += 2^1*arr[6]
		//...
		// sum += 2^7*arr[0]

	}

}
