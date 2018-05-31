package step1;

import java.util.Scanner;
/**
 과제 : 물건의 금액과 개수, 할인율을 입력받아 최종 금액 출력하기
 
 사용자로부터 단위금액과 구입하고자 하는 개수를 입력받는다.
 총 금액을 화면에 출력하고, 사용자로부터 할인율을 입력받는다.
 해당 퍼센트가 10%이상인 경우에는 "안팔아요"라는 메세지를 출력하고
 10%미만인 경우에는 원금에서 할인된 금액을 최종 출력한다.
 * */
public class HowMuch{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("실행 : 1, 종료 : 0");
			
			switch(scan.nextInt()){
				case 0 : return;
				case 1 : 	
					System.out.print("손님 : 얼마에요?\n금액 : ");

					int itemPrice = scan.nextInt();

					System.out.print("주인 : "+itemPrice+"원 입니다.\n주인 : 몇개 드릴까요?\n개수 : ");
		
					int itemNum = scan.nextInt();
					System.out.print("손님 : "+itemNum+"개 주세요.\n");

					int sum = itemPrice * itemNum;
					System.out.print("주인 : 총 금액은 "+sum+"원 입니다.\n손님 : 비싸요, 깎아주세요!\n주인 : 몇 퍼센트 DC해드릴까요?\n퍼센트 : ");
					double percent = scan.nextDouble();

					String result="주인 : 안 팔아요!\n";

					if(percent<10){
						sum *=1.0 -(percent / 100.0);
						result = "주인 : "+sum +"원 입니다.\n";
					}
					System.out.print(result);
					break;
				default : 
					System.out.println("ERROR");
					break;
			}
		}
	}
}




