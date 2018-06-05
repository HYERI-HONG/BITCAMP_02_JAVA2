package step3;

import javax.swing.JOptionPane;

public class Starbucks_2 {
	public static void main(String[] args) {
		
		int sum = 0;
		String result = "";

		while (true) {
			String option = JOptionPane.showInputDialog("메뉴를 고르세요.\n\n0 : 주문 완료\n1 : 아메리카노  [3,000원]\n2 : 라떼 [3,500원]\n3 : 카푸치노 [4,000원]");
			String num = "";
			
			switch (Integer.parseInt(option)) {
			case 0:
				JOptionPane.showMessageDialog(null,"<주문 확인>\n"+result+"\n총 결제 금액 :  "+sum+"원");
				return;
			case 1:
				num = JOptionPane.showInputDialog("수량을 입력하세요");
				sum += 3000 * Integer.parseInt(num);
				result += "아메리카노" + Integer.parseInt(num) + "잔\n";
				break;
			case 2:
				num = JOptionPane.showInputDialog("수량을 입력하세요");
				sum += 3500 * Integer.parseInt(num);
				result += "라떼" + Integer.parseInt(num) + "잔\n";
				break;
			case 3:
				num = JOptionPane.showInputDialog("수량을 입력하세요");
				sum += 4000 * Integer.parseInt(num);
				result += "카푸치노" + Integer.parseInt(num) + "잔\n";
				break;
			}
		}
	}
}
