package step2;

import java.util.Scanner;

public class GrandReport_2 {

	public static boolean validation(int n) {

		return (n >= 0 && n <= 100) ? true : false;
	}

	public static String[] getSum(String[] grade) {
		String[] result = new String[1];
		result[0] = String.valueOf(Integer.parseInt(grade[0]) + Integer.parseInt(grade[1]) + Integer.parseInt(grade[2]));
		return result;
	}

	public static String[] getAveg(String[] sum) {
		String[] result = new String[2];
		result[0] = sum[0];
		result[1] = String.valueOf(Integer.parseInt(sum[0]) / 3);
		return result;
	}
	public static String[] getGrade(String[] aveg) {
		String[] result = new String[3];
		result[0]= aveg[0];
		result[1]= aveg[1];
		
		switch (Integer.parseInt(aveg[1])/10) {
		case 10:
		case 9:
			result[2] = "A";
			break;
		case 8:
			result[2] = "B";
			break;
		case 7:
			result[2] = "C";
			break;
		case 6:
			result[2] = "D";
			break;
		case 5:
			result[2] = "E";
			break;
		default:
			result[2] = "F";
			break;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] subject = { "국어", "영어", "수학" };
		String[] grade = new String[3];
		
		System.out.println("이름을 입력하세요 : ");
		String name = scan.next();
		int check=0;
		
		for (int i = 0; i < 3; i++) {
			System.out.printf("%s 점수를 입력하세요 :\n ", subject[i]);
			check = Integer.parseInt(scan.next());
			if (validation(check)) {
				grade[i] = String.valueOf(check);
			} else {
				i--;
			}
		}
			String[] result = getGrade(getAveg(getSum(grade)));
			
			System.out.printf("************************************************\n");
			System.out.printf("|        이름        |        총점        |        평균        |        등급       |\n");
			System.out.printf("----------------------------------------------------------------------------\n");
			System.out.printf("|        %s      |        %s       |        %s        |        %s        |\n", name, result[0],result[1], result[2]);
			System.out.printf("************************************************\n");
	}
}
