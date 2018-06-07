package step5;
import javax.swing.JOptionPane;
public class MultiplicationTable {
	public static void main(String[] args) {
		String result = "";
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 6; j++) {
				result += j + " x " + i + "=" + (i * j) + "                      ";
			}
			result += "\n";
		}
		result +="\n\n";
		for (int i = 1; i < 10; i++) {
			for (int j = 6; j < 10; j++) {
				result += j + " x " + i + "=" + (i * j) + "                      ";
			}
			result += "\n";
		}
		JOptionPane.showMessageDialog(null, result);
	}
}
