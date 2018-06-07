package step5;
import javax.swing.JOptionPane;
enum Butt{
	EXIT,
	INPUT,
	LIST
}
public class Salary {

	public static void main(String[] args) {
	Butt[] buttons = {
		Butt.EXIT,
		Butt.INPUT,
		Butt.LIST
};
		String[][] data = new String[5][5];
		int row=0; 
		String[] listName= {"부서","성명","본봉","수당","합계"};
		
		while(true) {
			
		Butt select = (Butt)JOptionPane.showInputDialog(null,"부서별 합계", "기능을 선택하세요",
					JOptionPane.QUESTION_MESSAGE, null, buttons, buttons[1]);
			switch(select) {
			case EXIT : return;
			case INPUT :
				int sum=0;
				for(int col=0;col<4; col++) {
					data[row][col] = JOptionPane.showInputDialog(listName[col]+"를 입력하세요 : ");
					if(col>1) {
						sum += Integer.parseInt(data[row][col]);
					}
				}
				data[row][4] =String.valueOf(sum);
				row++;
				break;
			case LIST :
				String result ="부서   성명   본봉|수당|합계|\n";
				for(int i=0; i<5; i++) {
					for(int j=0; j<5; j++) {
						result += data[i][j]+"   ";
					}
					result+="\n";
				}
				JOptionPane.showMessageDialog(null, result);
				break;
			
			
			}
		}

	}

}
