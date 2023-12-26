package 문자열기본문제;

import java.util.Random;
import java.util.Scanner;

public class _문제12타자연습2단계 {
	public static void main(String[] args) {
		
		/*
		 1. 문제를 섞는다.
		 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
		 3. 문제를 출제할 때, 단어의 랜덤한 위치 한 곳만 *로 출력
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
				
		int i = 0;
		int cnt = 0;
		int pass = 0;
		int idx = 0;
		while (true) {
			if (cnt == 4) {
				System.out.println("클리어");
				break;
			}
			if (pass == 0) {
				idx = rd.nextInt(words[i].length());
			}			
			System.out.print("문제 : ");
			for (int j = 0; j < words[i].length(); j++) {
				System.out.print(j == idx ? "*" : words[i].charAt(j));
			}
			System.out.println();
			System.out.print("정답 : ");
			String answer = sc.nextLine(); // next()를 쓰면 띄어쓰기 때문에			
			if (answer.equals(words[i])) { // 이상하게 된다.
				System.out.println("정답");
				pass = 0;
				cnt++;				
			} else {
				System.out.println("오답");
				pass = -1;
				continue;
			}
			i++;
		}
		sc.close();
		
	}
}
