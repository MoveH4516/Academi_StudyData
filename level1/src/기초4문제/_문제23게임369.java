package 기초4문제;
/*
 * [문제] 1. 1~50 사이의 랜덤 숫자를 저장한다.
 *  2. 위 수에 3 6 9 의 개수가 
 *  2-1) 2개이면, 짝짝을 출력 
 *  2-2) 1개이면, 짝을 출력 
 *  2-3) 0개이면, 해당 숫자를 출력
 */
import java.util.Random;

public class _문제23게임369 {
	public static void main(String[] args) {		

		Random rd = new Random();
		int num = rd.nextInt(50) + 1;
		System.out.printf("랜덤 숫자 : %d\n", num);

		boolean req1 = num / 10 == 3 || num / 10 == 6 || num / 10 == 9;
		boolean req2 = num % 10 == 3 || num % 10 == 6 || num % 10 == 9;		
		boolean req3 = num >=30 && num <40;
		
		if (req2 && req3) {
			System.out.println("짝짝");
		} else if ((req2 && !req3) || !req2 && req3) {
			System.out.println("짝");
		} else {
			System.out.println(num);
		}
				
		if (req1 && req2) {
			System.out.println("짝짝");
		} else if ((req1 && !req2) || !req1 && req2) {
			System.out.println("짝");
		} else {
			System.out.println(num);
		}

	}
}
