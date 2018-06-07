package step4;
/**
 행마다 방향 전환하기
  1   2   3   4   5
 10   9   8  7   6
 11 12 13 14 15
 20 19 18 17 16
 21 22 23 24 25
 * */
public class Matrix_03_Zigzag {

	public static void main(String[] args) {
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
				System.out.print("[" + mtx[i][j] + "]");
			}
			System.out.println();
		}
	}
}
