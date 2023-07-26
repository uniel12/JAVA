package re20230630;

import java.util.Scanner;

public class Ex05피라미드1단계 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N 높이의 피라미드 출력하기 : ");
		int n = sc.nextInt();
		int cnt =0;
		for (int i = 0; i <n ; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.print("\t");
			}
			for(int j=0; j < (i*2+1); j++){
				cnt++;
				System.out.print(cnt+"\t");
			}
			
			
			System.out.println();
			}

	
	}

}
