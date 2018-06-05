package step3;

import javax.swing.JOptionPane;

public class ArrayTest {

	public static int getSum(String[] scores) {
		return Integer.parseInt(scores[1]) + Integer.parseInt(scores[2]) + Integer.parseInt(scores[3]);
	}

	public static int getAve(int sum) {
		return sum / 3;
	}

	public static String getGrade(int ave) {
		String grade = "";
		switch (ave / 10) {
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
		int sum = 0, ave = 0, count = 0;
		String grade = "";
		String[] result = new String[3];
		int[] rank = new int[3];

		while (true) {
			switch (JOptionPane.showInputDialog("종료 : 0, 성적 입력 : 1,  전체보기 : 2,  순위 출력 : 3")) {
			case "0":
				return;
			case "1":
				String info = JOptionPane.showInputDialog("이름/국어/영어/수학 ");
				String[] score = info.split("/");

				sum = getSum(score);
				ave = getAve(sum);
				grade = getGrade(ave);

				rank[count] = ave;
				result[count] = score[0] + "|" + score[1] + "|" + score[2] + "|" + score[3] + "|" + sum + "|" + ave
						+ "|" + grade;
				count++;
				break;
			case "2":
				String output = "";
				for (int i = 0; i < result.length; i++) {
					output += result[i] + "\n";
				}
				JOptionPane.showMessageDialog(null,
						"\n    이 름    |   국 어   |   영 어   |   수 학   |   총 점   |   평 균   |   학 점   \n" + output);
				break;
			case "3":
				String ranklist = " ";
				String[] temp = new String[7];
				temp = result[0].split("|");
				String name1 = temp[0];
				temp = result[1].split("|");
				String name2 = temp[0];
				temp = result[2].split("|");
				String name3 = temp[0];

				if (rank[0] > rank[1] && rank[0] > rank[2]) {
					ranklist = "1등 :" + name1 + "\n";
					if (rank[1] > rank[2]) {
						ranklist += "2등 :" + name2 + "\n" + "3등 :" + name3 + "\n";
					} else {
						ranklist += "2등 :" + name3 + "\n" + "3등 :" + name2 + "\n";
					}
				} else if (rank[1] > rank[2]) {
					ranklist = "1등 :" + name2 + "\n";
					if (rank[0] > rank[2]) {
						ranklist += "2등 :" + name1 + "\n" + "3등 :" + name3 + "\n";
					} else {
						ranklist += "2등 :" + name3 + "\n" + "3등 :" + name1 + "\n";
					}
				} else {
					ranklist = "1등 :" + name3 + "\n";
					if (rank[0] > rank[1]) {
						ranklist += "2등 :" + name1 + "\n" + "3등 :" + name2 + "\n";
					} else {
						ranklist += "2등 :" + name2 + "\n" + "3등 :" + name1 + "\n";
					}
				}
				JOptionPane.showMessageDialog(null, "\n\t< 순위 >\n" + ranklist);
				break;
			}
		}
	}
}
