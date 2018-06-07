package step4;

public class Matrix_09_Snail {
/**
 달팽이 만들기
  1   2   3   4  5
 16 17 18 19 6
 15 24 25 20 7
 14 23 22 21 8
 13 12 11 10 9
 
 count는 2회전 후에 --한다.(for문 반복 횟수 결정)
 각각의 행과 열값인 row, col은 증가와 감소를 번갈아
 
 0회전 (0,0)(0,1)(0,2)(0,3)(0,4) count=5/ 행값 고정, 열값증가(col=0~4)                               +sing(=1)
 1회전 (1,4)(2,4)(3,4)(4,4)         count=4/행값 증가(row=1~4) , 열값 고정(col=4)                 +sing(=1)
 2회전 (4,3)(4,2)(4,1)(4,0)         count=4/행값 고정(row=4), 열값 감소(Col=3~0)                  +sign(*=-1)
 3회전 (3,0)(2,0)(1,0)                 count=3/행값 감소(row=3~1), 열값 고정(col=0)                  +sign(=-1)
 4회전 (1,1)(1,2)(1,3)                count=3/행값 고정(row=1), 열값 증가(col=1~3)                   +sign(*=-1)
 5회전 (2,3)(3,3)                       count=2/행값 증가(row2~3, 열값 고정(col=3)                       +sign(=1)
 6회전 (3,2)(3,1)                       count=2/행값 고정(row=3), 열값 감소(col=2~1)                   +sign(*=-1)
 7회전 (2,1)                               count=1/행값 감소(row=2), 열값 고정(col=1)                       +sign(=-1)
 8회전 (2,2)                               count=1/행값 고정. 열값 증가                                               +sign(*=-1)
 
 * */
	public static void main(String[] args) {
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
				System.out.print("[" + mtx[i][j] + "]");
			}
			System.out.println();
		}
	}
}
