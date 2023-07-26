package ex클래스_객체;

public class ContactMain {

	public static void main(String[] args) {

		// 객체 생성
		Contact con1 = new Contact("서윤", 20, "010-2472-6374", "운암동");
		Contact con2 = new Contact("장채린", 21, "010-0000-0000", "뉴욕");
		Contact con3 = new Contact("백지수", 22, "010-0101-0101", "세부");
		Contact con4 = new Contact("김훈종", 23, "010-0202-0202", "화성");

		// 연락처를 담을 수 있는 배열 만들기

		Contact[] contact = new Contact[4];
		contact[0] = con1;
		contact[1] = con2;
		contact[2] = con3;
		contact[3] = con4;

		for (int i = 0; i < contact.length; i++) {

			String name = contact[i].getName();
			int age = contact[i].getAge();
			String tel = contact[i].getTel();
			String address = contact[i].getAddress();

			System.out.printf(" %d. %s(%d세) : %s, %s%n", (i + 1), name, age, tel, address);

		}

		// 서윤(20세) : 010-2472-6374, 운암동
//		String name1 = con1.getName();
//		int age1 = con1.getAge();
//		String tel1 = con1.getTel();
//		String address1 = con1.getAddress();
//		
//		System.out.printf("%s(%d세) : %s, %s%n", name1, age1, tel1, address1);

//		System.out.println(con.getName());
//		con.setName("bbb");
//		System.out.println(con.getName());

	}

}
