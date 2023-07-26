package festival;

import java.util.Scanner;

public class Ex21NXN배열_세로 {

	public static void main(String[] args) {
		//N*N 배열 숫자 진행 방향 위->아래
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][N];
		
	
		
		for(int k=0; k< arr.length;k++) {
	
		for (int i=0; i < arr[k].length;i++) {
			arr[k][i]=(k+1)+N*i;
			System.out.print(arr[k][i]+"\t");
		}
		System.out.println();
		}
		
		
		//arr[b][a] 행열이라 b는 행의 개수, a는 열의 개수
		//arr.length = 행의 길이
		//arr[0].length = 0번쨰 행의 열의 길이
		
		
		// 1 1+5 1+5+5 1+5+5+5 1+5+5+5+5 1+5*A
		// 2 2+5 2+5+5 2+(5*3) 2+(5*4)	 2+
		
		
		
//		for (int a=0; a < arr.length;a++) {
//			arr[a][0]=a+1;
//			System.out.print(arr[a][0]);
//		}
//		for (int a=0; a < arr.length;a++) {
//			arr[a][1]=(arr[a][0])+arr.length;
//			System.out.print(arr[a][1]);
//		}
		
		
//		for (int b=0; b < arr[a].length;b++) {
//			arr[a][b]=a+1;
//		}
//		
//		
//		arr[0][0]=1;
//		arr[1][0]=2;
//		arr[2][0]=3;
//		arr[3][0]=4;
//		arr[4][0]=5;
//		
//		arr[0][1]=6;
//		arr[1][1]=7;
//		arr[2][1]=8;
//		arr[3][1]=9;
//		arr[4][1]=10;
//		
//		arr[0][2]=11;
//		arr[1][2]=12;
//		
//	
//			
//		
//		for (int i = 0; i < arr.length ; i++ ) {
//			for(int j=0; j< i; j++) {
//			System.out.println(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}
//		
		
		
		
		sc.close();
		
	}
	
}
		
