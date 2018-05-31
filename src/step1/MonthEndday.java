package step1;

import java.util.Scanner;
/**
과제 :  월의 마지막 일 수를 알려주기

사용자로부터 월을 입력받아 해당 월의 마지막 일수를 출력한다.
1,3,5,7,8,10,12월은 31일이 마지막 일이고
4,6,9,11월은 30일이 마지막 일,
2월은 28일을 마지막 일로 한다.
 * */
public class MonthEndday{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		while(true){

			System.out.println("\n실행 : 1, 종료 : 0");
			switch(scan.nextInt()){
				case 0:
					return;
				case 1:
					System.out.print("월을 입력하세요 : ");
					int month = scan.nextInt();
					int date =31;

					if(month==2){
						date=28;
					}else if(month<8){
						if((month%2)==0){
							date = 30;
						}
					}else{
						if((month%2)==1){
							date = 30;
						}
					}
					System.out.print("\n결과 : "+month+"월 "+date+"일");
					break;
				default :
					System.out.print("ERROR");
					break;

			}
		}
		
	}
}