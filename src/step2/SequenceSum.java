package step2;

/**
 기사 시험문제 : [수열1] 1+2+3+......+100까지의 합계
 변형된 요구 사항 :
 정수를 입력받아 두 수 사이의 합을 구하는 프로그램을 구현하시오
 출력 : 5+6+7+......+10 =  
 * */

import java.util.Scanner;
public class SequenceSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("실행 : 1, 종료 : 0");
		
		while(true){
			
			switch(scan.nextInt()) {
				case 0 : 
					return;
				case 1 :
					System.out.println("시작값을 입력하세요 : ");
					int strNum= scan.nextInt();
					System.out.println("종료값을 입력하세요 :");
					int endNum = scan.nextInt();
					int temp = 0, sum = 0;
					String result = " ", opcode=" + ";
					
					if(strNum>endNum) {
						temp = strNum;
						strNum = endNum;
						endNum = temp;
					}
					for(int i = strNum; i<(endNum+1); i++) {
						sum += i;
						if(i == endNum){
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
