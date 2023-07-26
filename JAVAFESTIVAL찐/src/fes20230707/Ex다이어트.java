package fes20230707;

import java.util.Scanner;

public class Ex다이어트 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("현재 몸무게 :");
		int pw= sc.nextInt();
		System.out.print("목표 몸무게 :");
		int fw= sc.nextInt();
		int ww;
		int i=1;
		
		while(true){
			System.out.print(i+"주차 감량 몸무게 : ");
			i++;
			ww= sc.nextInt();
			pw-=ww;
			if(pw<fw) {
				System.out.println(pw+"kg 달성!! 축하합니다!");
				break;
		}
	

	}

}

}
