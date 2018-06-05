package step3;

import javax.swing.JOptionPane;

/**
 * 과제 : 가위바위보 게임
 * 
 * 사용자로부터 두번 가위,바위,보 중에 한개를 문자로 입력받고 모든 경우의 수를 고려하여 두 값을 비교, 가위바위보의 승패를 출력한다.
 */

public class RPSGame {

	public static void main(String[] args) {
		int total = 0, same = 0, win = 0;
		
		while (true) {
			int com = (int) (Math.random() * 10), user = 0;
			String result = "";
			
			if ((com > 0) && (com < 4)) {
				user = Integer.parseInt(JOptionPane.showInputDialog("가위 : 1, 바위: 2, 보 : 3, 종료 : 4\n사용자 : "));
				if(user ==4) {
					JOptionPane.showMessageDialog(null,"게임 끝!\n" + "\n" + total + "전 " + win + "승 " + same + "무" + (total - win - same) + "패");
					return;
				}
				switch (com - user) {
				case 0:
					result = "무승부!";
					same++;
					break;
					
					
					
					
					
					
					
					
					
				case 1:
				case -2:
					result = "컴퓨터 승리!";
					break;
				case -1:
				case 2:
					result = "사용자 승리!";
					win++;
					break;
				}
				total++;
				JOptionPane.showMessageDialog(null,
						result + "\n" + total + "전 " + win + "승 " + same + "무" + (total - win - same) + "패");
			}
		}
	}
}
