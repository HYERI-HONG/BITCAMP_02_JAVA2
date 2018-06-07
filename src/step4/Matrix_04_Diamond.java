package step4;
/**
 다이아몬드 만들기
           1
      2   3   4
 5   6   7   8   9
     10 11 12
          13
 * */
public class Matrix_04_Diamond {

	public static void main(String[] args) {
		int[][] mtx = new int[5][5];
		int count = 0;

		for (int i = 0; i < 5; i++) {
			if (i < 3) {
				for (int j = 2 - i; j < 3+i; j++) {
					count++;
					mtx[i][j]=count;
				}
			} else {
				for (int j = i-2; j < 7-i; j++) {
					count++;
					mtx[i][j]=count;
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
