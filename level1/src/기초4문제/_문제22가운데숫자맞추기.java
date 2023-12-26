package 기초4문제;

import java.util.Random;
import java.util.Scanner;

public class _문제22가운데숫자맞추기 {
	public static void main(String[] args) {

		/*
		 * [문제] 1. 150~250 사이의 랜덤 숫자 저장 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다. 예) 가운데 숫자를 입력하세요 249
		 * -> 4 : 정답, 5 : 오답
		 */

		Random rd = new Random();
		int num = rd.nextInt(101) + 150;
		System.out.printf("랜덤한 숫자 : %d\n", num);
		Scanner sc = new Scanner(System.in);
		System.out.print("가운데 숫자 : ");
		int midNum = sc.nextInt();

		boolean result = num % 100 / 10 == midNum;

		if (midNum >= 0 && midNum < 10) {
			if (result) {
				System.out.println("정답");
			} else {
				System.out.println("오답");
			}
		} else {
			System.out.println("0~9 사이의 정수를 입력하세요.");
		}
		sc.close();
	}
}
