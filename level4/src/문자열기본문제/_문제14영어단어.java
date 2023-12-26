package 문자열기본문제;

import java.util.Random;
import java.util.Scanner;

public class _문제14영어단어 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	처음 영어단어는 전부 *로 표시되어 출력
		 	영어단어를 입력받아 틀릴 때 마다 랜덤으로 한 글자씩 벗겨진다.
		 	단, 점수는 5점씩 감점
		 	또한 같은 철자가 여러개이면 한 번에 벗겨진다.
		 	전부 벗겨지거나 영어단어를 맞추면 게임은 종료된다.
		 */
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		String word = "performance";
		String meaning = "공연";
		int score = 100;
		int size = word.length();
		int idx = 0;
		boolean[] check = new boolean[size];
		boolean run = false;
		while (true) {		
			if (run) {
				idx = rd.nextInt(size);
				if (check[idx] == false) {					
					check[idx] = true;
				} else {
					continue;
				}
			}
			System.out.println("====================");
			for (int j = 0; j < size && check[idx]; j++) {
				if (word.charAt(j) == word.charAt(idx)) {
					check[j] = true;
				}
			}
			System.out.println("의미 : " + meaning);
			for (int j = 0; j < word.length(); j++) {
				if (check[j] == false) {
					System.out.print("*");
				} else {
					System.out.print(word.charAt(j));
				}
			}
			int cnt = 0;
			for (int j = 0; j < check.length; j++) {
				if (check[j] == true) {
					cnt++;
				} else {
					break;
				}
			}
			System.out.println();
			if (cnt == check.length) {
				System.out.println("다음에 다시 도전하세요");
				break;
			}			
			System.out.print("정답 : ");
			String input = sc.next();
			if (input.equals(word)) {
				System.out.println("정답");
				System.out.println(score + "점");
				break;
			}
			System.out.println("오답");
			score -= 5;
			run = true;						
		}
		sc.close();
	}
}
