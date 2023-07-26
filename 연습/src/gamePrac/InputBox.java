package gamePrac;

import javax.swing.JOptionPane;

public class InputBox {

	public static void main(String[] args) {

		int year = Integer.parseInt(JOptionPane.showInputDialog("당신의 출생년도는?"));

		int age = 2023 - year + 1;
		JOptionPane.showMessageDialog(null, "당신의 나이는 " + age + "세입니다.");

		if (age >= 20) {

			JOptionPane.showMessageDialog(null, "성인이시군요");

		} else if (age >= 15) {

			JOptionPane.showMessageDialog(null, "청소년이군요");

		} else {

			JOptionPane.showMessageDialog(null, "어린이군요");

		}

	}

}
