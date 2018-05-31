package step1;
import java.util.Scanner;
/**
 과제 : 가위바위보 게임
 
 사용자로부터 두번 가위,바위,보 중에 한개를 문자로 입력받고
 모든 경우의 수를 고려하여 두 값을 비교,
 가위바위보의 승패를 출력한다.
 * */

public class RPSGame {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("실행 : 1, 종료 : 0");
			switch(scan.nextInt()){
				case 0 : return;
				case 1 : 
					System.out.print("\t\t<가위바위보 게임>\n\n가위 : S, 바위: R, 보 : P\n\n");

					System.out.print("사용자1 : ");
					String user1 = scan.next();

					System.out.print("사용자2 : ");
					String user2 = scan.next();

					String result = "무승부";  

				
					if((user1.equals("s")&&user2.equals("p"))||(user1.equals("r")&&user2.equals("s"))||(user1.equals("p")&&user2.equals("r"))){
						result = "사용자1승리";
					}
					else if((user1.equals("s")&&user2.equals("r"))||(user1.equals("r")&&user2.equals("p"))||(user1.equals("p")&&user2.equals("s"))){
						result = "사용자2승리";
					}
					System.out.print("\n\n결과 : " + result + "!!\n" );
					break;
				default : 
					System.out.println("ERROR");
					break;
			}
		}

	}

}
