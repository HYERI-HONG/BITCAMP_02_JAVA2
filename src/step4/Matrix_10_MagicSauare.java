package step4;

/**
 * 마방진 만들기
 * 
 */
public class Matrix_10_MagicSauare {

	public static void main(String[] args) {
		int row = 0, col = 2, nrow = 0, ncol = 0, value = 1;
		int[][] mtx = new int[5][5];
		mtx[row][col] = value;
		for (value = 2; value < 26; value++) {

			if (row == 0) {
				nrow = 4;
			} else {
				nrow = row - 1;
			}
			if (col == 4) {
				ncol = 0;
			} else {
				ncol = col + 1;
			}
			if (mtx[nrow][ncol] == 0) {
				row = nrow;
				col = ncol;
			} else {
				row++;
			}
			mtx[row][col] = value;
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("[" + mtx[i][j] + "]");
			}
			System.out.println();
		}
	}
}
