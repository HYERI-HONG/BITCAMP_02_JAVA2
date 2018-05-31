package step1;

/**
과제 : 연속적인 수의 합

사용자로 부터 시작값과 끝값을 입력받는다.
만약 시작값이 끝값보다 클 경우 두 값을 바꿔준다.
시작값부터 1씩 값을 더해 끝값까지 모두 더해준다.
더한 모든 값과 결과를 다음과 같이 출력해서 보여준다.
예시)
시작값 : 4, 끝값 : 10
출력 화면 :
4 + 5 + 6 + 7 + 8 + 9 + 10 = 49
 * */
import java.util.Scanner;

public class Series {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		while(true){

			System.out.println("실행 : 1, 종료 : 0");

			switch(scan.nextInt()){
				case 0 :
					return;
				case 1 :
					System.out.print("시작값 : ");
					int strNum = scan.nextInt();
					System.out.print("종료값 : ");
					int endNum = scan.nextInt();
					int temp =0, sum=0;
					String result="", opcode=" + ";

					if(strNum > endNum){
						temp = strNum;
						strNum = endNum;
						endNum = temp;
					}
					for(int i=strNum; i<(endNum+1); i++){

						if(i==endNum){
							opcode=" = ";
						}
						sum += i;
						result += i + opcode;

					}
					System.out.println(result+sum);
					break;

				default : 
					System.out.print("ERROR");
					break;
			}		
		}
	}

}
