package step4;
/**
 왼쪽에서 오른쪽으로
 * */
public class MatrixBasic_1 {

	public static void main(String[] args) {
		int k =0;
		int[][] mtx = new int[5][5];
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				k++;
				mtx[i][j]=k;
			}
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("["+mtx[i][j]+"]");
			}
			System.out.println();
		}
	}
}
