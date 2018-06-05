package step3;

import javax.swing.JOptionPane;

/**
 * 과제 : 사칙연산 계산기 만들기
 * 
 * 사용자로부터 두 정수를 입력받고, 원하는 연산을 입력받아 두 정수를 계산, 계산값을 최종 출력한다. 만약 정해진 4개의 연산 이외의 것을
 * 입력할 겨우 오류를 출력한다.
 */
public class Calc {
	public static void main(String[] args) {

		String result = JOptionPane.showInputDialog("정수를 입력하세요 : \n");
		int sum = Integer.parseInt(result);

		while (true) {
			int num = 0;

			String opcode = JOptionPane.showInputDialog("\n원하는 연산을 입력하세요 : \n");

			switch (opcode) {
			case "+":
				num = Integer.parseInt(JOptionPane.showInputDialog("정수를 입력하세요 : \n"));
				sum += num;
				break;
			case "-":
				num = Integer.parseInt(JOptionPane.showInputDialog("정수를 입력하세요 : \n"));
				sum -= num;
				break;
			case "*":
				num = Integer.parseInt(JOptionPane.showInputDialog("정수를 입력하세요 : \n"));
				sum *= num;
				break;
			case "/":
				num = Integer.parseInt(JOptionPane.showInputDialog("정수를 입력하세요 : \n"));
				sum /= num;
				break;
			case "%":
				num = Integer.parseInt(JOptionPane.showInputDialog("정수를 입력하세요 : \n"));
				sum %= num;
				break;
			case "=":
				JOptionPane.showMessageDialog(null, result += opcode + sum);
				return;
			}
			result += opcode + num;
		}
	}
}