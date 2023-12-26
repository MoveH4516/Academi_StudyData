package level2_Test;

import java.util.Random;

public class _문제04 {
	public static void main(String[] args) {
		/*
		[문제]
			1 ~ 10,000 사이의 숫자를 입력받고
			자리별 홀수의 개수를 출력하시오.
			
			예)
				561		: 2개
				1		:   1개
				668		: 0개
				9999	: 4개
				
		걸린시간 : 7분34초00
	 */
		Random rd = new Random();
		int num = rd.nextInt(10000) + 1;
		int k = num;
		System.out.println("숫자 입력 : " + num);
		
		int cnt = 0;
		while (true) {
			
			if (num % 10 % 2 != 0) {
				cnt++;
			}
			num = num / 10;
			if (num == 0) {
				break;
			}
		}
		System.out.println(k + "의 자리별 홀수의 개수 : " + cnt + "개");
	}
}
