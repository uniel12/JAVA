package 월급계산프로그램;

public class RegularEmployee extends Employee {

	// 필드 : 데이터 속성, 변수
	int bonus;
	// 메서드 : 객체의 행위, 기능

	// 객체를 생성과 동시에 초기화 시켜주기 위해서 생성자를 만든다!
	// 생성자
	// : 클래스의 이름과 같다
	// : 리턴타입이 없다. voidxxx
	// 기본생성자는 새로운 생성자가 생기면 기능을 잃음
	// -> 사용하고 싶으면 눈에 보이는 코드로 작성한다.

	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno,name,pay);
		
		this.bonus = bonus;
	}

	@Override
	public int getMoneyPay() {
		return (pay + bonus) / 12;
	}



}
