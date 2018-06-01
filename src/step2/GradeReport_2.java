package step2;

import java.util.Scanner;

public class GradeReport_2 {

	public static String input(Scanner scan) {

		System.out.print("국어, 영어, 수학 점수 : \n");
		String result = scan.next();

		return result;
	}
	public static int[] calc(Scanner scan) {

		int[] result = new int[2];

		String get = input(scan);
		String[] calc = new String[3];
		calc = get.split(",");

		int score1 = Integer.parseInt(calc[0]);
		int score2 = Integer.parseInt(calc[1]);
		int score3 = Integer.parseInt(calc[2]);

		result[0] = score1 + score2 + score3;
		result[1] = result[0] / 3;

		return result;
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
				String grade = grade(arr[1]);

				System.out.printf("************************************************\n");
				System.out.printf("|        이름        |        총점        |        평균        |        등급       |\n");
				System.out.printf("----------------------------------------------------------------------------\n");
				System.out.printf("|        %s      |        %d       |        %d        |        %s        |\n", name,arr[0], arr[1], grade);
				System.out.printf("************************************************\n");
				break;
			default:
				System.out.printf("ERROR");
				break;
			}
		}
	}
}