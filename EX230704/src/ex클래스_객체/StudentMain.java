package ex클래스_객체;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동","20220614",20,60,80,55);
		Student s2 = new Student("이주희","20152548",26,100,90,85);
		s1.show();
		s2.show();
//		Student [] st = new Student[2];
//		st [0] = s1;
//		st[1] = s2;
//
//		for(int i=0; i<st.length;i++) {
//			st[i].show();
//		}
		
	}

}
