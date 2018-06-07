package step4;

import javax.swing.JOptionPane;

enum Butt {
	EXIT, LEFT_TRIANGLE, RIGHT_TRIANGLE, ZIGZAG, DIAMOND, SAND_GLASS, TRIANGLE, DIAGONAL, SNAIL;
}

public class Matrix {
	public static String leftTriangle() {
		String result = "";
		int count = 0;
		int[][] mtx = new int[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				count++;
				mtx[i][j] = count;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				result += "[" + mtx[i][j] + "]";
			}
			result += "\n";
		}
		return result;
	}

	public static String rightTriangle() {
		String result = "";
		int count = 0;
		int[][] mtx = new int[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 4 - i; j < 5; j++) {
				count++;
				mtx[i][j] = count;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				result += "[" + mtx[i][j] + "]";
			}
			result += "\n";
		}
		return result;
	}

	public static String zigzag() {
		String result = "";
		int[][] mtx = new int[5][5];
		int count = 0;

		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				for (int j = 4; j >= 0; j--) {
					count++;
					mtx[i][j] = count;
				}
			} else {
				for (int j = 0; j < 5; j++) {
					count++;
					mtx[i][j] = count;
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				result += "[" + mtx[i][j] + "]";
			}
			result += "\n";
		}
		return result;
	}

	public static String diamond() {
		String result = "";
		int[][] mtx = new int[5][5];
		int count = 0;

		for (int i = 0; i < 5; i++) {
			if (i < 3) {
				for (int j = 2 - i; j < 3 + i; j++) {
					count++;
					mtx[i][j] = count;
				}
			} else {
				for (int j = i - 2; j < 7 - i; j++) {
					count++;
					mtx[i][j] = count;
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				result += "[" + mtx[i][j] + "]";
			}
			result += "\n";
		}
		return result;
	}

	public static String sandGlass() {
		String result = "";
		int[][] mtx = new int[5][5];
		int count = 0;

		for (int i = 0; i < 5; i++) {
			if (i < 3) {
				for (int j = i; j < 5 - i; j++) {
					count++;
					mtx[i][j] = count;
				}
			} else {
				for (int j = 4 - i; j < i + 1; j++) {
					count++;
					mtx[i][j] = count;
				}
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				result += "[" + mtx[i][j] + "]";
			}
			result += "\n";
		}
		return result;
	}

	public static String triangle() {
		String result = "";
		int[][] mtx = new int[7][4];
		int count = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 3 - i; j < 4 + i; j++) {
				count++;
				mtx[j][i] = count;
			}
		}
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 4; j++) {
				result += "[" + mtx[i][j] + "]";
			}
			result += "\n";
		}
		return result;
	}

	public static String diagnoal() {
		String result = "";
		int count = 0;
		int[][] mtx = new int[5][5];
		int k = 0;

		for (int rotation = 0; rotation < 9; rotation++) {
			for (int i = 0; i < 5; i++) {
				k = rotation - i;
				if (k >= 0 && k < 5) {
					count++;
					mtx[i][k] = count;
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				result += "[ " + mtx[i][j] + " ]";
			}
			result += "\n";
		}
		return result;
	}

	public static String snail() {
		String result = "";
		int[][] mtx = new int[5][5];
		int count = 5, row = 0, col = -1, sign = 1, value = 1;
		for (int rotation = 0; rotation < 9; rotation++) {
			for (int i = 0; i < count; i++) {
				col += sign;
				mtx[row][col] = value;
				value++;
			}
			count--;
			for (int i = 0; i < count; i++) {
				row += sign;
				mtx[row][col] = value;
				value++;
			}
			sign *= (-1);
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				result += "[" + mtx[i][j] + "]";
			}
			result += "\n";
		}
		return result;
	}

	public static void main(String[] args) {
		Butt[] buttons = { Butt.EXIT, Butt.LEFT_TRIANGLE, Butt.RIGHT_TRIANGLE, Butt.ZIGZAG, Butt.DIAMOND,
				Butt.SAND_GLASS, Butt.TRIANGLE, Butt.DIAGONAL, Butt.SNAIL };
		while (true) {
			Butt select = (Butt) JOptionPane.showInputDialog(null, "MATRIX PAGE", "SELECT MATRIX MENU",
					JOptionPane.QUESTION_MESSAGE, null, buttons, buttons[1]);
			String result = " ";

			switch (select) {
			case EXIT:return;
			case LEFT_TRIANGLE:     result = leftTriangle();break;
			case RIGHT_TRIANGLE:  result = rightTriangle();break;
			case ZIGZAG:                  result = zigzag();break;
			case DIAMOND:             result = diamond();break;
			case SAND_GLASS:         result = sandGlass();break;
			case TRIANGLE:              result = triangle();break;
			case DIAGONAL:            result = diagnoal();break;
			case SNAIL:                     result = snail();break;
			}
			JOptionPane.showMessageDialog(null, result);
		}
	}
}
