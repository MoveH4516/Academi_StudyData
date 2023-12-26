package level4_test;

import java.util.Random;
import java.util.Scanner;

public class _문제05 {
	public static void main(String[] args) {
		
		/*
		 * # 타자연습 게임[2단계]
		 * 1. 문제를 섞는다.(shuffle)
		 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
		 * 3. 단 문제를 출제할 때, 단어의 랜덤한 위치 한 곳만 *(랜덤 위치 )로 출력 
		 * 예)
		 * 문제 : mys*l
		 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
		 * 문제 : *sp
		 * 입력 : jap
		 * 문제 : j*p (x) : 문제 틀릴시 별 고정 
		 * 문제 : *sp (0)
		 * 
		 * 13분42초28
		 */
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		String[] words = {"java", "mysql", "jsp", "spring"};
		
		for (int i = 0; i < 100; i++) {
			int rand = rd.nextInt(words.length);
			String temp = words[0];
			words[0] = words[rand];
			words[rand] = temp;
		}
		boolean run = true;
		int r = 0;
		for (int i = 0; i < words.length; i++) {
			if (run) {
				r = rd.nextInt(words[i].length());
			}
			System.out.print("문제 : ");

			for (int j = 0; j < words[i].length(); j++) {
				if (r != j) {
					System.out.print(words[i].charAt(j));
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
			
			System.out.print("정답 : ");
			String answer = sc.next();
			
			if (!words[i].equals(answer)) {
				System.out.println("오답");
				i--;
				run = false;
				continue;
			} else {
				System.out.println("정답");
			}
		}
		System.out.println("종료");
		sc.close();
	}
}
