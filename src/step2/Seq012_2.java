package step2;

/**
 [문제 012]
 과제 : 1부터 10까지 합 구하기
 화면 출력
 1+2+3+4+..........+10 = 55입니다.
 * */
import java.util.Scanner;

public class Seq012_2 {
	public static void Input(Scanner scan) {
			System.out.println("시작값 : ");
			int strNum = scan.nextInt();
			System.out.println("종료값 : ");
			int endNum = scan.nextInt();

			System.out.println("종료 : 0, 홀수 : 1, 짝수 : 2");
			int temp =0;
			if (strNum > endNum) {
				temp = strNum;
				strNum = endNum;
				endNum = temp;
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (true) {
			int sum = 0, count = 0, totalCount = 0, strNum=0, endNum=0;
			String result = " ";
			
			switch (scan.nextInt()) {
			case 0:
				return;
			case 1:
				Input(scan);
				for (int i = strNum; i <= endNum; i++) {
					if (i % 2 == 1) {
						totalCount++;
					}
				}
				for (int i = strNum; i <= endNum; i++) {
					if (i % 2 == 1) {
						count++;
						if (count == totalCount) {
							result += i + " = ";
						} else {
							result += i + " + ";
						}
						sum += i;
					}
				}
				System.out.println(result + sum);
				break;
			case 2:
				for (int i = strNum; i <= endNum; i++) {
					if (i % 2 == 0) {
						totalCount++;
					}
				}
				for (int i = strNum; i <= endNum; i++) {
					if (i % 2 == 0) {
						count++;
						if (count == totalCount) {
							result += i + " = ";
						} else {
							result += i + " + ";
						}
						sum += i;
					}
				}
				System.out.println(result + sum);
				break;
			default:
				return;

			}
		}
	}

}
