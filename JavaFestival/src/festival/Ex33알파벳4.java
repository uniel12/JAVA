package festival;

import java.util.Scanner;

public class Ex33알파벳4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 >>");
		String str = sc.nextLine().toLowerCase();

		char[] alpha = str.toCharArray();
		
		int [] cnt = new int [26] ;

		for(int j = 0; j <alpha.length; j++) {
		for(int i = 'a'; i<='z'; i++) {
			if(alpha[j]==i) {
				cnt[i-97]++;
			}
		}
		}

		for(int i=97; i<=122; i++) {
			System.out.println((char)i+" : "+cnt[i-97]);
		}
		
		
	}
	
}