package step1;

import java.util.Scanner;
/**
 과제 : BMI계산기 만들기
 
 사용자로부터 사용자의 이름과 체중(kg)과 신장(cm)값을 입력 받는다.
 신장의 경우 cm를 m단위로 변환한다.
 BMI계산식 = 체중 / 키의 제곱
 2018년 비만 진료 지침에 따라
 18.5 미만인 경우에는 '저체중'
 18.5이상 23미만인 경우에는 '정상'
 23이상 25미만인 경우에는 '비만 전단계'
 25이상 30미만인 경우에는 '1단계 비만'
 30이상 35미만인 경우에는 '2단계 비만'
 35이상인 경우에는 '3단계 비만' 으로 분류한다.
 최종적으로 결과값을 출력한다.
 * */

public class Bmi{
	public static void main(String[] args){
		
		Scanner scan =new Scanner(System.in);
		System.out.println();
		while(true){

			System.out.println("\n실행 : 1, 종료 : 0");
			int flag = scan.nextInt();

			switch(flag){
				case 0 :
					System.out.print("----------------- 종료 -------------------");
					return; 
				case 1 :
					System.out.print("\n\n----------------- 실행 -------------------\n\n");
					System.out.println("\t\t<BMI 계산기>\n\n사용자 이름을 입력하세요 : ");
					String name = scan.next();

					System.out.println("\n사용자 체중(kg)을 입력하세요 : ");
					double weight = scan.nextDouble();

					System.out.println("\n사용자 키(cm)를 입력하세요 : ");
					double height = scan.nextDouble();
					height /= 100;

					double result = weight/(height*height);
					String state ="";

					if(result<18.5){
						state ="저체중";
					}else if(18.5<=result&&result<23){
						state ="정상";
					}else if(23<=result&&result<25){
						state ="비만 전단계";
					}else if(25<=result&&result<30){
						state ="1단계 비만";
					}else if(30<=result&&result<35){
						state ="2단계 비만";
					}else{
						state ="3단계 비만";
					}
					System.out.println("\n\n결과 : "+name+"님은 "+state+"입니다.");
					break;
				default : 
					System.out.print("ERROR");
					break;

			}
			
		}
		
	}
}
