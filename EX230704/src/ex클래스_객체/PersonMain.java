package ex클래스_객체;

public class PersonMain {

	public static void main(String[] args) {
		
		// Person 설계도 클래스를 이용해서 사람(Object)이 만들어지는 클래스
		
		// 1. 사람(객체) 생성하기
		// 객체를 생성할 때 -> new 키워드 사용
		Person p1 = new Person();
		
		p1.name= "서윤";
		p1.gender="여자";
		p1.heigth=163.5;
		
		System.out.println(p1.name);
		System.out.println(p1.gender);
		System.out.println(p1.heigth);
		
		p1.eat();
		p1.talk();
		
		Person p2 = new Person();
		
		p2.name="이주희";
		p2.gender="여자";
		p2.heigth=164.4;
		
		System.out.println(p2.name);
		System.out.println(p2.gender);
		System.out.println(p2.heigth);
		
		p2.eat();
		p2.talk();
		
		Person p3 = new Person("유도언","남자",200);
		
		// 기본데이터 타입 말고는 null값 넣어도 됨
		
		System.out.println(p3.name+p3.heigth+p3.name);  
		

	}

}
