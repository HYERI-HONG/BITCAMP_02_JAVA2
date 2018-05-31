package step1;

import java.util.Scanner;
/**
 과제 : 사칙연산 계산기 만들기
 
 사용자로부터 두 정수를 입력받고, 원하는 연산을 입력받아
 두 정수를 계산, 계산값을 최종 출력한다.
 만약 정해진 4개의 연산 이외의 것을 입력할 겨우 오류를 출력한다.
 * */
public class Calc{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.println("\n실행 : 1, 종료 : 0");

			switch(scan.nextInt()){
				case 0:
					return;
				case 1: 
					System.out.print("\n두 정수를 입력하세요 : \n");
					int num1 = scan.nextInt();
					int num2 = scan.nextInt();

					System.out.print("원하는 연산을 입력하세요 :");
					String opcode = scan.next();
					int sum = 0;
					String result = " ";

					switch(opcode){
						case "+" : 
							sum = num1 + num2;
							break;
						case "-" : 
							sum = num1 - num2;
							break;
						case "*" : 
							sum = num1 * num2;
							break;
						case "/" : 
							sum = num1 / num2;
							break;
						case "%" : 
							sum = num1 % num2;
							break;
						default :
							result = "ERROR";
							break;
					}
					if(!result.equals("ERROR")) {
						result = num1+" "+opcode+" "+num2+" = "+ sum;
					}
					System.out.print("\n\n결과 : "+ result);
					break;
				default :
					System.out.print("ERROR");
					break;
	     	}

		}
	}
}