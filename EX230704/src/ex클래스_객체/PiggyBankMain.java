package ex클래스_객체;

public class PiggyBankMain {

	public static void main(String[] args) {
		// 저금통 (PiggyBank )클래스
		
		 PiggyBank pig = new PiggyBank();
		
		 // 1500원, 700원 저금하기
		 pig.deposit(1500);
		 pig.deposit(700);
		 pig.showMoney();
		 
		 // 500원 출금하기
		 pig.withdraw(500);
		 pig.showMoney();
	}

}
