package step2;

import java.util.Scanner;

/**
 * [문제 013] 항 사이의 증가하는 값이 일정한 비율로 증가하는 수열(스캐너 없음) 1+2+4+7+11+16+22+...순서로 나열되는
 * 수열의 20번째 항까지의 합계
 */
public class Seq013 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("실행 : 1, 종료 : 0");
		while (true) {
			switch (scan.nextInt()) {
			case 0:
				return;
			case 1:
				String result =" ", opcode = " + ";
				int num=1, sum=0;
				for(int i=1; i<21; i++) {
					if(i==20) {
						opcode = " = ";
					}
					result += num + opcode;
					sum +=num;
					num +=i;
				}
				System.out.println(result+sum);
				break;
			default:
				System.out.println("ERROR");
				break;
			}
		}
	}
}
