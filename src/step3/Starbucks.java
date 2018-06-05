package step3;
import java.util.Scanner;
/**
 
 * */
public class Starbucks {
	public static  String[] validation(String order) {
		
		String[] check = order.split(",");
		if((Integer.parseInt(check[0])<0)&&(Integer.parseInt(check[0])>3)){
				check[0] = "4";
		}
		return check;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum =0;
		String result=" ";
		
		while (true) {
			System.out.println("무엇으로 몇잔 드릴까요? :  메뉴 , 수량\n");
			System.out.println("0 : 주문 완료\n1 : 아메리카노  [3,000원]\n2 : 라떼 [3,500원]\n3 : 카푸치노 [4,000원]");
			
			String[] order = validation(scan.next());	
			
			switch(Integer.parseInt(order[0])) {
			case 0 :
				System.out.printf("\n--------------------------------------------------------\n%s\n총 결재금액은 %d원 입니다.\n\n", result,sum);	
				return;
			case 1	:
				sum += 3000*Integer.parseInt(order[1]);
				result += "아메리카노 " + Integer.parseInt(order[1]) + "잔 ";
				break;
			case 2 :
				sum += 3500*Integer.parseInt(order[1]);
				result += "라떼 " + Integer.parseInt(order[1]) + "잔 ";
				break;
			case 3 : 
				sum += 4000*Integer.parseInt(order[1]);
				result += "카푸치노 " + Integer.parseInt(order[1]) + "잔 ";
				break;
			case 4 : 
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				break;
			}
		}
	}
}
