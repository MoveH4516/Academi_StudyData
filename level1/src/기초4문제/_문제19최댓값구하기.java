package 기초4문제;

import java.util.Random;

public class _문제19최댓값구하기 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1. 숫자 3개를 랜덤으로 저장한다. (-1000~1000 사이의 숫자)
		 	2. 3개의 랜덤 숫자를 비교한다.
		 	3. 가장 큰 수를 출력한다.
		 */
		
		Random rd = new Random();
		
		int num1 = rd.nextInt(2001) - 1000;
		int num2 = rd.nextInt(2001) - 1000;
		int num3 = rd.nextInt(2001) - 1000;
		
		System.out.printf("첫 번째 숫자 : %d\n", num1 );
		System.out.printf("두 번째 숫자 : %d\n", num2 );
		System.out.printf("세 번째 숫자 : %d\n", num3 );
		
		// num1이 가장 큰 경우
		// num1 > num2 && num2 > num3, num1 > num3 && num3 > num2
		// 2, 3도 마찬가지로 총 6가지의 경우의 수
						
		if (num1 == num2 && num2 == num3) {
			System.out.println("모두 같은 숫자 입니다.");
		}
		else if (num1 > num2 && num1 > num3) {
			System.out.println(num1);
		}
		else if (num2 > num3 && num2 > num1) {
			System.out.println(num2);
		}else {
			System.out.println(num3);
		}
		
		int max = num1;
		if (max < num2) {
			max = num2;
		}
		if (max < num3) {
			max = num3;
		}
		System.out.println(max);
	}
}
