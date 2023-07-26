package 월급계산프로그램;

public abstract class Employee {
	
	
	// 정규직, 비정규직, 아르바이트생이 가지는 공통적인
	// 필드와 메서드
	
	// default
	// public : 클래스 내/ 외부에서 마음대로 접근가능
	// private : 클래스 내부에 설계되어 있는 메서드를 통해서만 접근 가능
	// protected : 상속관계에 있는 클래스에서만 접근 가능
	protected String empno;
	protected String name;
	protected int pay;
	
	

	// 부모 클래스가 생성자를 포함하고 있으면
	// 반드시 자식 클래스에서 생성자가 구현되어야한다.

	public Employee(String empno, String name, int pay) {
		super(); // 부모클래스의 생성자 키워드
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	
	}
	
	// getMoneyPay --->구현 {}부분이 다 다름
	public abstract int getMoneyPay();

	// print ---> {}까지 똑같았음!
	public String print() {
		return empno + " : " + name + " : " + pay;
	}

}
