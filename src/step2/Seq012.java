package step2;

/**
 [문제 012]
 과제 : 두 정수를 입력받아 홀수 혹은 짝수의 합 구하기

 * */
import java.util.Scanner;

public class Seq012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("시작값 : ");
			int strNum = scan.nextInt();
			System.out.println("종료값 : ");
			int endNum = scan.nextInt();

			System.out.println("종료 : 0, 홀수 : 1, 짝수 : 2");

			int sum = 0, temp = 0, count = 0, totalCount = 0;
			;
			String result = " ";

			if (strNum > endNum) {
				temp = strNum;
				strNum = endNum;
				endNum = temp;
			}
			switch (scan.nextInt()) {
			case 0:
				return;
			case 1:

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
