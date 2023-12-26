package 기초4문제;

import java.util.Random;

public class _문제18자리수 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1. 10000~90000 사이의 랜덤 숫자 2개를 저장한다.
		 	2. 각각의 랜덤 숫자의 배그이자리 숫자를 비교해서 백의자리가 더 큰 숫자를 출력한다.
		 	3. 서로 같으면 "equal" 을 출력한다.
		 */
		
		Random rd = new Random();
		int num1 = rd.nextInt(80001) + 10000;
		int num2 = rd.nextInt(80001) + 10000;
		
		int num100 = num1 % 1000 / 100;
		int num200 = num2 % 1000 / 100;
		System.out.printf("첫 번째 숫자 : %d\n", num1);
		System.out.printf("두 번째 숫자 : %d\n", num2);
		if (num100 > num200) {
			System.out.println(num1);
		}
		else if (num100 < num200) {
			System.out.println(num2);
		}else {
			System.out.println("equal");
		}
	}
}
