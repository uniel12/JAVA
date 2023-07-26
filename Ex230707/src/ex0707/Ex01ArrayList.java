package ex0707;

import java.util.ArrayList;

public class Ex01ArrayList {

	public static void main(String[] args) {
		
		// 1. ArrayList 선언 및 생성
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// 2. 값 추가
		list.add(5); // 0번 인덱스
		list.add(3); // 1번 인덱스
		list.add(1); // 2번 인덱스
		
		// 3. 갑조회
		for(int i =0; i < list.size(); i++) {
			System.out.println(i+"번 인덱스 "+list.get(i) +" ");
		}
		System.out.println("========================");
		// 4. 내가 원하는 위치에 값추가
		list.add(1,4);
		for(int i =0; i < list.size(); i++) {
			System.out.println(i+"번 인덱스 "+list.get(i) +" ");
		}
		System.out.println("========================");
		// 5. 값 삭제
			//지정삭제
		list.remove(1);
		for(int i =0; i < list.size(); i++) {
			System.out.println(i+"번 인덱스 "+list.get(i) +" ");
		}
		System.out.println("========================");
			//전체 삭제
		list.clear();
		
			System.out.println(list.size());
		

		
		
		
		
	}

}
