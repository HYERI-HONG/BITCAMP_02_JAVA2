package step1;

import java.util.Scanner;
/**
 
 * */
public class LeapYear{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		while(true){
			System.out.println("실행 : 1, 종료 : 0");
			switch(scan.nextInt()){
				case 0 : return;
				case 1 : 
					System.out.print("연도를 입력하세요 : ");

					int year = scan.nextInt();
					String result ="평년";

					if(((year%4)==0)&&((year%100)!=0)||((year%400)==0)){
						result = "윤년";
					}
					System.out.println("결과 : "+year+"은 "+result+"입니다.");
					break;
				default : 
					System.out.print("ERROR");
					break;
			}
		}
		
	}
}
