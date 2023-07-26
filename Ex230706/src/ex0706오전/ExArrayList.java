package ex0706오전;

import java.util.ArrayList;

public class ExArrayList {

	public static void main(String[] args) {
		
		// 1. 선언 및 생성
		// 배열
		int [] arr = new int [5];
		
		// ArrayList(가변리스트)
		// ArrayList는 import 해야함 java.util.ArrayList.class
		// ArrayList<데이터타입> 변수명 = new ArrayList<데이터타입>();
		// -클래스 형태이기 때문에 import 해야하고,
		// () : 메소드를 사용해서 생성
		// <> : 제네릭기법
		// 데이터타입 -> 객체타입(=클래스타입)으로 존재해야함(기본데이터타입 불가)
		// int(정수) -> Integer
		// 생성 시 크기 지정 X
		ArrayList<Integer> aL = new ArrayList<Integer>();
		
		// 크기 알아보기
		System.out.println("배열 크기 : "+arr.length);
		System.out.println("ArrayList 크기 : "+aL.size());
		// 2.값 추가
		// 배열 
		arr[0] =0;
		arr[1] =1;
		arr[2] =2;
		arr[3] =3;
		arr[4] =4;
		
		// ArrayList -> 변수명.add(값)-> 맨 뒤의 인덱스로 추가
		//			 -> 변수명.add(인덱스, 값) ->원하는 위치에 추가
		aL.add(0); // 0-> 인덱스 X, 데이터 O
		aL.add(1); 
		aL.add(2); 
		aL.add(3); 
		
		
		
		System.out.println("값 추가 후 ArrayList 크기 : "+aL.size());
		
		// 3. 값 조회
		// 배열 -> 변수명[인덱스] 
		System.out.println("배열의 0번 인덱스 : "+ arr[0]);
		
		// ArrayList -> 변수명.get(인덱스)
		System.out.println("ArrayList의 0번 인덱스 : " + aL.get(0));
		
		// for문을 사용해서 ArrayList 값 전체 조회
		
		for(int i=0; i<aL.size(); i++) {
			System.out.println(i+"번째 인덱스의 값 : "+aL.get(i));
		}
		
		// 4. 값 삭제 -> 원하는 위치 값 삭제 : 변수명.remove(인덱스)
		//			-> 모든 값 삭제 : 변수명.removeAll() (추천X)
		//			-> 모든 값 삭제 : 변수명.clear() (추천X)
		
		aL.remove(0);
		System.out.println(aL.get(0));
		System.out.println(aL.size());
		aL.clear();
		System.out.println(aL.size());
		
		
		
		
		
		
		
		
		
	}

}
