package step4;
/**
 오른쪽 직각 삼각형 만들기
                          1
                    2    3
              4    5    6
        7    8    9   10
 11  12  13  14  15
 * */
public class Matrix_02_RightTriangle {

	public static void main(String[] args) {
		int count =0;
		int[][] mtx = new int[5][5];
		
		for(int i=0; i<5; i++) {
			for(int j=4-i; j<5; j++) {
				count++;
				mtx[i][j]=count;
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
