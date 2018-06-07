package step4;
/**
 대각선으로 채우기
  1   2   4   7  11
  3   5   8  12 16
  6   9  13 17 20
 10 14 18 21 23
 15 19 22 24 25
 행은 1~5까지, 최대 다섯게까지 찍음으로
 0회전 (0,0) 열 = 행 - 회전수
 1회전 (0,1)(1,0)   -- //1-2=-1
 2회전 (0,2)(1,1)(2,0) // 2-3=-1
 3회전 (0,3)(1,2)(2,1)(3,0)
 4회전 (0,4)(1,3)(2,2)(3,1)(4,0)
 5회전 (1,4)(2,3)(3,2)(4,1)   //5-0=5
 6회전 (2,4)(3,3)(4,2) //6-0, 6-1=5
 7회전 (3,4)(4,3)
 8회전 (4,4)
 
 열값이 0크보다 같고 5보다 작아야함
 * */
public class Matrix_07_Diagonal {

	public static void main(String[] args) {
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
				System.out.print("[ "+mtx[i][j]+" ]");
			}
			System.out.println();
		}
	}
}
