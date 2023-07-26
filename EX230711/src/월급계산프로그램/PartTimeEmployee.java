package 월급계산프로그램;

public class PartTimeEmployee extends Employee {
	// 필드
	String empno;
	String name;
	int pay;
	int workDay;

	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super(empno,name,pay);
		this.workDay = workDay;
	}

	@Override
	public int getMoneyPay() {
		return pay * workDay;
	}

}
