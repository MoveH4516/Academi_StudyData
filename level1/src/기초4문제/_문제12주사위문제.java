package 기초4문제;

import java.util.Random;

public class _문제12주사위문제 {
	public static void main(String[] args) {
		
		/*
		 	[문제]
		 	철수는 주사위 2개를 가지고 있다.
		 	주사위는 눈금이 1~6까지 있다.
		 	철수가 주사위 2개를 던졌을 때 그 합을 출력하시오.
		 	단, 주사위 눈금이 서로 같으면 6을 추가로 더하시오.
		 */
		Random rand = new Random();
		int dice1 = rand.nextInt(6) + 1;
		System.out.printf("첫 번째 주사위의 눈금 : %d\n",dice1);
		int dice2 = rand.nextInt(6) + 1;;
		System.out.printf("두 번째 주사위의 눈금 : %d\n",dice2);
		int sum = dice1 + dice2;
		boolean result = dice1 == dice2;
		boolean req = dice1 > 0 && dice1 <=6 && dice2 > 0 && dice2 <=6;
		if (req) {
			if (result) {
				System.out.printf("두 주사위의 눈금의 합 + 6 : %d\n",sum += 6);
			}
			if (!result) {
				System.out.printf("두 주사위의 눈금의 합 : %d\n",sum);
			}
		}
		if (!req) {
			System.out.println("주사위의 눈금은 1~6의 정수만 가능합니다.");
		}
	}
}
