package step2;
/**
 과제 : 1부터 10까지 합 구하기
 화면 출력
 1+2+3+4+..........+10 = 55입니다.
 * */
import java.util.Scanner;
public class EvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			System.out.println("실행 : 1, 종료 : 0");
			
			while(true){
				
				switch(scan.nextInt()) {
					case 0 : 
						return;
					case 1 :
						int sum = 0;
						String result = " ", opcode=" + ";
						for(int i = 1; i<11; i++) {
							sum += i;
							if(i == 10){
								opcode = " = ";
							}
							result += i + opcode;
						}
						System.out.println(result + sum);
						break;
					default :
						System.out.println("ERROR");
						break;
				
				}
			}
	}

}
