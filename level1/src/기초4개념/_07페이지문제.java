package 기초4개념;

import java.util.Random;

public class _07페이지문제 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1~200 사이의 랜덤 숫자를 저장하고 다음과 같이 출력
		 	랜덤 숫자가
		 	1~10 -> 1
		 	11~20 -> 11
		 	21~30 -> 31
		 	'''''
		 	101~110 -> 101
		 */
		
		Random rd = new Random();
		int num = rd.nextInt(200) + 1;
		
		System.out.printf("랜덤한 숫자 : %d\n", num);
		int num10 = num / 10;		
		
		if (num % 10 == 0) {
			num10 -= 1;
		}
		
		System.out.printf("%d\n",num10 * 10 + 1);
		
	}
}
