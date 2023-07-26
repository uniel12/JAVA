package fes20230707;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일한 시간을 입력하세요 : ");
		int h = sc.nextInt();
		int over = (int)((h-8)*5000*1.5)+8*5000;
		System.out.print("총 임금은 ");
		if(h<=8) {
			System.out.print(h*5000+"입니다.");
		}else if(h>8) {
			System.out.print(over+"입니다.");
		}
		
	}

}
