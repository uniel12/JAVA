package ex클래스_객체;

public class Student {
	// 학생정보 관리 프로그램

	String name; // 이름
	String number;// 학번 
	int age; // 나이
	int scoreJava; //자바점수
	int scoreWeb; // 웹점수
	int scoreAndroid; //안드로이드점수

	public Student(String name, String number, int age, int scoreJava, int scoreWeb, int scoreAndroid) {
		super();
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}

	public void show() {
		System.out.printf("%s님 안녕하세요.%n"
				+"[%s,%d]%n"
				+"%s님 Java점수는 %d점입니다.%n"
				+"%s님 Web점수는 %d점입니다.%n"
				+"%s님 Android점수는 %d점입니다.%n"
				+"=============================%n"
				,name,number,age,name,scoreJava,name,scoreWeb,name,scoreAndroid);
//		System.out.printf("%s님 안녕하세요.%n[%s,%d]%n",name,number,age);
//		System.out.printf("%s님 Java점수는 %d점입니다.%n",name,scoreJava);
//		System.out.printf("%s님 Web점수는 %d점입니다.%n",name,scoreWeb);
//		System.out.printf("%s님 Android점수는 %d점입니다.%n",name,scoreAndroid);
//		System.out.println("=====================================");
	}
}
