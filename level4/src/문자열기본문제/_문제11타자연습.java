package 문자열기본문제;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _문제11타자연습 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1. 문제를 섞는다
		 	2. 순서대로 문제를 출력하고 다 맞추면 게임 종료
		 */
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		String[] words = {"java", "mysql", "jsp", "spring"};
		String temp = "";
		for (int i = 0; i < 100; i++) {
			int num = rd.nextInt(words.length);
			temp = words[num];
			words[num] = words[0];
			words[0] = temp;
		}
		System.out.println(Arrays.toString(words));
		int i = 0;
		int cnt = 0;
		while (true) {
			if (cnt == 4) {
				System.out.println("클리어");
				break;
			}
			System.out.println("문제 : " + words[i]);
			System.out.print("정답 : ");
			String answer = sc.nextLine(); // next()를 쓰면 띄어쓰기 때문에			
			if (answer.equals(words[i])) { // 이상하게 된다.
				System.out.println("정답");
				cnt++;				
			} else {
				System.out.println("오답");
				continue;
			}
			i++;
		}
		sc.close();
	}
}
