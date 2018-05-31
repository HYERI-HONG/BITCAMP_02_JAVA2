package step2;

/**
 * [011문제] 과제 : 1부터 100까지 숫자중 홀수번째는 -, 짝수번째는 +로 계산해서 결과값 도출하기 출력 예시)
 * 1-2+3-4+5-6+..........100=-50
 */
public class Seq011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int posSum = 0, negSum = 0, sum = 0;
		String result = "", opcode = " + ";

		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				negSum += i;
				opcode = " + ";
			} else {
				posSum += i;
				opcode = " - ";
			}
			if (i == 100) {
				opcode = " = ";
			}
			result += i + opcode;
		}
		sum = posSum - negSum;
		System.out.println(result + sum);
	}
}
