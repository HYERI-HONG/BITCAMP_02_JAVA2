package step2;

import java.util.Scanner;

/**
 * 과제 : 점수를 입력받아 평균과 학점 구하기
 * 
 * 사용자로부터 이름과 3과목 국어, 영어, 수학 점수를 각각 입력받는다. 세 점수의 평균을 구하고, 해당 평균이 90이상이면 'A',
 * 80이상 90 미만이면 'B' 70이상 80미만이면 'C', 60이상 70미만이면 'D' 50이상 60미만이면 'E', 50미만이면
 * 'F'로 평가한다.
 */

public class GradeReport {

	public static int[] input(Scanner scan) {

		int[] grade = new int[3];

		System.out.print("국어 점수 : \n");
		int korean = scan.nextInt();
		System.out.print("영어 점수 : \n");
		int english = scan.nextInt();
		System.out.print("수학 점수 : \n");
		int math = scan.nextInt();

		grade[0] = korean;
		grade[1] = english;
		grade[2] = math;

		return grade;
	}

	public static int[] calc(Scanner scan) {

		int[] get = input(scan);
		int sum = 0, ave = 0;
		sum = get[0] + get[1] + get[2];
		ave = sum / 3;

		get[0] = sum;
		get[1] = ave;

		return get;
	}

	public static String grade(int ave) {
		String grade = " ";

		switch (ave / 10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		case 5:
			grade = "E";
			break;
		default:
			grade = "F";
			break;
		}
		return grade;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println("실행 : 1, 종료 : 0");
			switch (scan.nextInt()) {
			case 0:
				return;
			case 1:
				System.out.print("이름을 입력하세요 : \n");
				String name = scan.next();

				int[] arr = calc(scan);
				int sum = arr[0];
				int ave = arr[1];
				String grade = grade(arr[1]);

				System.out.printf("************************************************\n");
				System.out.printf("|        이름        |        총점        |        평균        |        등급       |\n");
				System.out.printf("----------------------------------------------------------------------------\n");
				System.out.printf("|        %s       |        %d       |        %d       |        %s      |\n",name, sum,ave,grade);
				System.out.printf("************************************************\n");
				break;
			default:
				System.out.printf("ERROR");
				break;
			}
		}
	}
}