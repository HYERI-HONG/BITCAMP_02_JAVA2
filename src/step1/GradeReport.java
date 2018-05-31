package step1;

import java.util.Scanner;

/**
 과제 : 점수를 입력받아 평균과 학점 구하기
 
 사용자로부터 이름과 3과목 국어, 영어, 수학 점수를 각각 입력받는다.
 세 점수의 평균을 구하고, 해당 평균이 
 90이상이면 'A', 80이상 90 미만이면 'B'
 70이상 80미만이면 'C', 60이상 70미만이면 'D'
 50이상 60미만이면 'E', 50미만이면 'F'로 평가한다.
 * */
public class GradeReport{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("실행 : 1, 종료 : 0");
			switch(scan.nextInt()){
				case 0 : return;
				case 1 : 
					System.out.print("이름을 입력하세요 : \n");
					String name = scan.next();

					System.out.print("국어 점수 : \n");
					int korean = scan.nextInt();
					System.out.print("영어 점수 : \n");
					int english = scan.nextInt();
					System.out.print("수학 점수 : \n");
					int math = scan.nextInt();

					int ave = (korean + english + math)/3;
					String grade = "";

					switch(ave/10){
						case 10 :
						case 9 :
							grade = "A";
							break;
						case 8 : 
							grade = "B";
							break;
						case 7 :
							grade = "C";
							break;
						case 6 :
							grade = "D";
							break;
						case 5 :
							grade = "E";
							break;
						default :
							grade = "F";
							break;
					} 
					System.out.println(name + "의 평균은 " + ave + " 학점은 "+grade);
					break;
				default : 
					System.out.println("ERROR");
					break;
			}
		}
	}
}