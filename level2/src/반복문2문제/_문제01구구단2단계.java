package 반복문2문제;

import java.util.Random;
import java.util.Scanner;

public class _문제01구구단2단계 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	구구단 게임
		 	1. 구구단 게임을 5회 반복한다.
		 	2. 정답을 맞추면 20점이다.
		 	3. 게임 종료 후, 성적을 출력한다.
		 */
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int score = 0;
		int i = 1;
		
		while (i <= 5) {
			int dan = rd.nextInt(8) + 2;
			int num = rd.nextInt(8) + 1;
			int ans = dan * num;
			System.out.printf("%d x %d = ", dan, num);
			int user = sc.nextInt();
			if (user == ans) {
				System.out.println("정답입니다. (+20점)");
				score += 20;
			} else {
				System.out.println("오답입니다. (+0점)");
			}
			i++;
		}
		System.out.println("총 점수 : " + score + "점");
		sc.close();
	}
}
