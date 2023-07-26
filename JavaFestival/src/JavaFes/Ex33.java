package JavaFes;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {

		// 알파벳 빈도수 구하기
		// 1. 입력하는 도구 가져오기
		Scanner sc = new Scanner(System.in);
		// 2. 문자열 입력받기 ----> nextLine()
		// next는 spacebar, nextLine은 Enter
		System.out.print("입력 >>");
		String str = sc.nextLine().toLowerCase();
		// .toLowerCase() ---> 문자열 소문자로 바꿔줌
		
		char[] alpha = str.toCharArray();
		
		//3. 알파벳들의 갯수가 저장된 int[] ---> 26
		// index 0 : a의 개수
		// index 1 : b의 개수
		// ..index 25 : z의 개수
		
		int [] cnt = new int [26] ;
		
		// alpha에 들어있는 소문자가 뭔지를 판단해서 해당 알파벳의 개수가 저장되는
		// cnt을 +1해주자
		for(int j = 0; j <alpha.length; j++) {
		for(int i = 'a'; i<='z'; i++) {
			if(alpha[j]==i) {
				cnt[i-97]++;
			}
		}
		}
// char[] list = str.toCharArray()
//		char[] list = str.toCharArray();

// char ---> int ----> a ---> 97 --->list[0]++;--->list[97-97]
// s ---> 115--->list[18]++;--->list[115-97]
// z ---> 122--->list[25]++;--->list[122-97]

// 유니코드 a ---> 97 ~z -----> 122

// +hint
//		for(int i = 'a'; i<='z'; i++) {
//			// 배열에 들어있는 char과 비교
//			
//		
//		}
//		
		for(int i=97; i<=122; i++) {
			System.out.println((char)i+" : "+cnt[i-97]);
		}
		
		
	}
	
}