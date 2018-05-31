package step1;

import java.util.Scanner;
/**
 과제 : 주민등록번호로 성별 구분하기
 
 사용자가 이름과 주민등록번호를 입력하면 해당 주민등록번호 본인의
 성별이 여자인지, 남자인지 혹은 외국인인지 구별하여
 결과값을 출력한다.
 입력은 다음과 같이 받는다. "000000-0000000"
 현행법상 주민등록번호의 7번째 숫자가 1,3이면 남자이고 2,4이면 여자,
 5,6이면 외국인으로 분류한다.
 사용자가 1,2,3,4,5,6 이외의 값을 입력할 경우 "다시 입력하세요"라고 알려준다.
 * */

public class CheckGender{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		while(true){

			System.out.println("\n실행 : 1, 종료 : 0");

			switch(scan.nextInt()){
				case 0:
					return;
				case 1: 
					System.out.print("이름을 입력하세요 : ");
					String name = scan.next();
					System.out.print("주민번호를 입력하세요 : ");
					String idNum = scan.next();

					char genderNum = idNum.charAt(7);
					String result="";

					if(genderNum=='1'||genderNum=='3'){
						result="남자";
					}else if(genderNum=='2'||genderNum=='4'){
						result="여자";
					}else if(genderNum=='5'||genderNum=='6'){
						result="외국인";
					}else{
						result="다시입력하세요";
					}
					System.out.println("\n\n"+name+" : "+result);
					break;
				default : 
					System.out.println("ERROR");
					break;

			}

		}
		
	}
}
