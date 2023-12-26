package 기초4문제;

import java.util.Random;
import java.util.Scanner;

public class _문제14구구단 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1. 구구단 문제 출제를 랜덤으로 받는다 (2단~9단)
		 	2. 입력받은 숫자를 토대로 구구단 문제를 출력한다. ( 3 x 7 = ? )
		 	3. 사용자에게 문제에 해당하는 정답을 입력받는다.
		 	4. 정답을 비교해 "정답" or "오답"을 출력한다.
		 */
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int dan = rd.nextInt(8) + 2;
		int num = rd.nextInt(9) + 1;
		int answer = dan * num;
		System.out.printf("%d단\n",dan);
		System.out.printf("%d x %d = ?\n",dan,num);
		System.out.print("정답 : ");
		int userAnswer = sc.nextInt();
		
		if (userAnswer == answer) {
			System.out.println("정답!");
		}
		if (userAnswer != answer) {
			System.out.println("오답!");
		}
		sc.close();
	}
}
