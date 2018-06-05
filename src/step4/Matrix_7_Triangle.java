package step4;

public class Matrix_7_Triangle {

	public static void main(String[] args) {
		int[][] mtx = new int[7][4];
		int count = 0;

		for (int i = 0; i < 4; i++) {
				for (int j = 3 - i; j < 4+i; j++) {
					count++;
					mtx[j][i]=count;
				}
		}
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("[" + mtx[i][j] + "]");
			}
			System.out.println();
		}
	}
}
